package com.example.sellars.service.user;

import com.example.sellars.dto.User;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import users.UserOuterClass.*;
import users.UserServiceGrpc;

import java.security.Principal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @GrpcClient("user-service")
    private UserServiceGrpc.UserServiceBlockingStub stub;
    private final PasswordEncoder passwordEncoder;

    @Override
    public boolean createUser(User user) {
        CreateUserRequest request = CreateUserRequest.newBuilder().setUser(
                        CreateUserRequest.User.newBuilder()
                                .setEmail(user.getEmail())
                                .setName(user.getName())
                                .setPassword(passwordEncoder.encode(user.getPassword()))
                                .setPhoneNum(user.getPhoneNumber())
                                .build())
                .build();
        CreateUserResponse response = this.stub.createUser(request);
        log.info("create user - "+response);
        return true;
    }


    @Override
    public boolean updateUser(User user) {
        UpdateUserRequest request = UpdateUserRequest.newBuilder().setUser(
                        UpdateUserRequest.User.newBuilder()
                                .setEmail(user.getEmail())
                                .setName(user.getName())
                                .setPassword(passwordEncoder.encode(user.getPassword()))
                                .setPhoneNum(user.getPhoneNumber())
                                .build())
                .build();
        FindUserByAttribute response = this.stub.updateUser(request);
        log.info("update user - " + response);
        return true;
    }

    @Override
    public boolean deleteUser(Principal principal) {

        return true;
    }

    @Override
    @SneakyThrows
    public void addAvatar(Principal user, MultipartFile file) {


    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        FindAllUsersRequest request = FindAllUsersRequest.newBuilder()
                .build();
        Iterator<FindUserByAttribute> response = stub.findAllUsers(request);
        while (response.hasNext()){
            users.add(makeUser(response.next()));
        }
        return users;
    }

    @Override
    public User getUserByEmail(String email) {
        FindByUserEmailRequest request = FindByUserEmailRequest.newBuilder()
                .setEmail(email)
                .build();
        return makeUser(stub.findByEmail(request));
    }

    @Override
    public User getUserById(Long id) {
        FindByUserIdRequest request = FindByUserIdRequest.newBuilder()
                .setUserId(id)
                .build();
        return makeUser(stub.findByUserId(request));
    }

    @Override
    public void blockUser(Long id) {
//        User user = userRepository.findById(id).orElse(null);
//        if (user != null) {
//            if (user.isActive()) {
//                user.setActive(false);
//                log.info("Ban user with id - {}", id);
//            } else {
//                user.setActive(true);
//                log.info("Reban user with id - {}", id);
//            }
//        }
    }

    @Override
    public void changeUserRole(User user, Map<String, String> form) {
//        Set<String> roles = Arrays.stream(Role.values())
//                .map(Role::name)
//                .collect(Collectors.toSet());
//        user.getRoles().clear();
//        for (String s : form.keySet()) {
//            if (roles.contains(s)) {
//                user.getRoles().add(Role.valueOf(s));
//            }
//        }
//        userRepository.save(user);
    }

    private User makeUser(FindUserByAttribute response){
        LocalDateTime time = Instant
                .ofEpochSecond( response.getUser().getDateOfCreated().getSeconds(),
                        response.getUser().getDateOfCreated().getNanos())
                .atZone( ZoneId.of( "Europe/Moscow" ))
                .toLocalDateTime();
        User user = new User();
        user.setId(response.getUser().getId());
        user.setName(response.getUser().getName());
        user.setEmail(response.getUser().getEmail());
        user.setPassword(response.getUser().getPassword());
        user.setActive(response.getUser().getIsActive());
        user.setPhoneNumber(response.getUser().getPhoneNum());
        user.setDateOfCreated(time);
        return user;
    }
}
