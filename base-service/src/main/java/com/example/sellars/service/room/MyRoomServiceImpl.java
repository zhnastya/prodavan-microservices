package com.example.sellars.service.room;

import com.example.sellars.dto.Product;
import com.example.sellars.dto.User;
import com.example.sellars.exeption.NotFoundException;
import com.example.sellars.service.product.ProductService;
import com.example.sellars.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

@Service
@Slf4j
@Qualifier("MyRoomServiceImpl")
@RequiredArgsConstructor
public class MyRoomServiceImpl implements MyRoomService {

    private final UserServiceImpl service;
    private final ProductService service1;


//    private Image toImageEntity(MultipartFile file) throws IOException {
//        Image imageForProduct = new Image();
//        imageForProduct.setName(file.getName());
//        imageForProduct.setOriginalFileName(file.getOriginalFilename());
//        imageForProduct.setContentType(file.getContentType());
//        imageForProduct.setSize(file.getSize());
//        imageForProduct.setBytes(file.getBytes());
//        return imageForProduct;
//    }


    @SneakyThrows
    @Override
    public void updateUser(Principal principal, User user, MultipartFile file) {
        User user1 = getUserByPrincipal(principal);
        if (file != null && file.getSize() != 0) {
            user1.setAvatar(file);
        }
        if (!service.updateUser(user)) {
            throw new NotFoundException("Ошибка в обновлении пользователя");
        }
    }


    @SneakyThrows
    @Override
    public void changeAvatar(Principal principal, MultipartFile file) {
        User user = getUserByPrincipal(principal);
        if (file.getSize() != 0) {
            user.setAvatar(file);
        }
        service.updateUser(user);
    }


    @Override
    public Product getByIdProduct(Long id) throws IOException, InterruptedException {
        return service1.getProductById(id);
    }


    @Override
    public void deleteUser(Principal principal) {
        if (!service.deleteUser(principal)) {
            throw new NotFoundException("Ошибка в удалении пользователя");
        }
    }


    @SneakyThrows
    @Override
    public void updateProduct(Long id, Product product, List<MultipartFile> files) {
        if (!files.isEmpty()) {
            product.setImages(files);
        }
    }


    @Override
    public List<Product> getMyProduct(Principal principal) {
        User user = getUserByPrincipal(principal);
        return null;
    }


    @Override
    public void deleteProduct(Long id) {

    }


    @Override
    public User getUserByPrincipal(Principal principal) {
        if (principal == null) return new User();
        return service.getUserByEmail(principal.getName());
    }
}
