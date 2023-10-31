package com.example.user.service;

import com.example.user.model.User;
import com.google.protobuf.Timestamp;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import users.UserOuterClass.*;
import users.UserServiceGrpc;

import java.time.ZoneOffset;
import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase{
    private final UserService service;

    @Override
    public void createUser(CreateUserRequest request,
                           StreamObserver<CreateUserResponse> response){
        User user = User.builder()
                .email(request.getUser().getEmail())
                .name(request.getUser().getName())
                .phoneNumber(request.getUser().getPhoneNum())
                .password(request.getUser().getPassword())
                .build();
        CreateUserResponse userResponse = CreateUserResponse.newBuilder()
                .setId(service.createUser(user))
                .build();

        response.onNext(userResponse);
        response.onCompleted();
    }

    @Override
    public void updateUser(UpdateUserRequest request,
                           StreamObserver<FindUserByAttribute> response){
        User user = User.builder()
                .email(request.getUser().getEmail())
                .name(request.getUser().getName())
                .phoneNumber(request.getUser().getPhoneNum())
                .password(request.getUser().getPassword())
                .build();

        response.onNext(makeResponse(service.updateUser(user)));
        response.onCompleted();
    }


    @Override
    public void findByUserId(FindByUserIdRequest request,
                           StreamObserver<FindUserByAttribute> response){
            User user = service.getUserById(request.getUserId());
            response.onNext(makeResponse(user));
            response.onCompleted();
    }

    @Override
    public void findByEmail(FindByUserEmailRequest request,
                                StreamObserver<FindUserByAttribute> response){
        User user = service.getUserByEmail(request.getEmail());
        response.onNext(makeResponse(user));
        response.onCompleted();
    }

    @Override
    public void findAllUsers(FindAllUsersRequest request,
                                StreamObserver<FindUserByAttribute> response){
        List<User> users = service.getUsers();
        for (User user : users) {
            response.onNext(makeResponse(user));
        }
        response.onCompleted();
    }

    private FindUserByAttribute makeResponse(User user){
        return FindUserByAttribute
                .newBuilder()
                .setUser(FindUserByAttribute.User
                        .newBuilder()
                        .setId(user.getId())
                        .setEmail(user.getEmail())
                        .setName(user.getName())
                        .setDateOfCreated(Timestamp.newBuilder()
                                .setSeconds(user.getDateOfCreated().toEpochSecond(ZoneOffset.UTC))
                                .setNanos(user.getDateOfCreated().getNano())
                                .build())
                        .setPassword(user.getPassword())
                        .setIsActive(user.isActive())
                        .setPhoneNum(user.getPhoneNumber())
                        .build())
                .build();
    }
}
