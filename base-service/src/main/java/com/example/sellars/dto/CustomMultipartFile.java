package com.example.sellars.dto;

import lombok.Data;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Path;

@Data
public class CustomMultipartFile implements MultipartFile {
    private final Long id;
    private final boolean isPreview;
    private final byte[] content;
    private final String contentType;
    private final String originalName;

    public CustomMultipartFile(Long id, boolean isPreview, byte[] content, String contentType, String originalName) {
        this.id = id;
        this.isPreview = isPreview;
        this.content = content;
        this.contentType = contentType;
        this.originalName = originalName;
    }

    @Override
    public String getName() {
        return originalName;
    }

    @Override
    public String getOriginalFilename() {
        return originalName;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public boolean isEmpty() {
        return content == null || content.length == 0;
    }

    @Override
    public long getSize() {
        return content.length;
    }

    @Override
    public byte[] getBytes() throws IOException {
        return content;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(content);
    }

    @Override
    public Resource getResource() {
        return MultipartFile.super.getResource();
    }

    @Override
    public void transferTo(File dest) throws IOException, IllegalStateException {
        new FileOutputStream(dest).write(content);
    }

    @Override
    public void transferTo(Path dest) throws IOException, IllegalStateException {
        MultipartFile.super.transferTo(dest);
    }
}
