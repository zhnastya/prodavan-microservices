package com.example.sellars.service.yandex;
import com.example.sellars.dto.CustomMultipartFile;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

@Service
public class YandexPhoto {
    public String savePhotos(MultipartFile file) throws IOException, InterruptedException, URISyntaxException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://cloud-api.yandex.net/v1/disk/resources/upload?path=%2FPhotos%2F"+
                        file.getOriginalFilename()+"&overwrite=true&fields=name,_embedded.items.path."))
                .header("Authorization", "y0_AgAAAAAiQpObAArF1QAAAADxGUlr5ibH5RreSt6z4j2Bf1J08GOYebg")
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject convertedObject = new Gson().fromJson(response.body(), JsonObject.class);
        String path = convertedObject.get("href").getAsString();

        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .PUT(HttpRequest.BodyPublishers.ofByteArray(file.getBytes()))
                .build();
        HttpResponse<String> resource = client.send(request2, HttpResponse.BodyHandlers.ofString());
        HttpHeaders headers = resource.headers();
        String path2 = headers.firstValue("location").orElse("");
        return path2.substring(5);
    }

    public CustomMultipartFile loadPhotos(Long id, boolean isPreview, String path2) throws IOException, InterruptedException {
        String urlEncoder = URLEncoder.encode(path2, StandardCharsets.UTF_8);
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://cloud-api.yandex.net/v1/disk/resources/download?path="+
                        urlEncoder))
                .header("Authorization", "y0_AgAAAAAiQpObAArF1QAAAADxGUlr5ibH5RreSt6z4j2Bf1J08GOYebg")
                .header("Content-Type", "image/png")
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JsonObject convertedObject = new Gson().fromJson(response.body(), JsonObject.class);
        String path = convertedObject.get("href").getAsString();

        HttpRequest request2 = HttpRequest.newBuilder()
                .uri(URI.create(path))
                .GET()
                .build();
        HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
        String newLocation = response2.headers().firstValue("location").orElse("");

        HttpRequest request3 = HttpRequest.newBuilder()
                .uri(URI.create(newLocation))
                .GET()
                .build();
        HttpResponse<String> response3 = client.send(request3, HttpResponse.BodyHandlers.ofString());
        HttpHeaders headers = response3.headers();

        return new CustomMultipartFile(id, isPreview, response3.body().getBytes(StandardCharsets.UTF_8),
                headers.firstValue("content-type").orElse(""), path2.substring(8));
    }
}