package com.example.user.service;

import com.example.user.model.User;
import com.google.protobuf.Timestamp;
import grpc.server.grpc_server.user.UserOuterClass;
import grpc.server.grpc_server.user.UserServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.ZoneOffset;
@GrpcService
@RequiredArgsConstructor
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase{
    private final UserService service;

    @Override
    public void createUser(UserOuterClass.CreateUserRequest request,
                           StreamObserver<UserOuterClass.CreateUserResponse> response){
        User user = User.builder()
                .email(request.getUser().getEmail())
                .name(request.getUser().getName())
                .phoneNumber(request.getUser().getPhoneNum())
                .password(request.getUser().getPassword())
                .build();
        UserOuterClass.CreateUserResponse userResponse = UserOuterClass
                .CreateUserResponse
                .newBuilder()
                .setId(service.createUser(user))
                .build();

        response.onNext(userResponse);
        response.onCompleted();
    }


    @Override
    public void findByUserId(UserOuterClass.FindByUserIdRequest request,
                           StreamObserver<UserOuterClass.FindByUserIdResponse> response){
            User user = service.findById(request.getUserId());
            UserOuterClass.FindByUserIdResponse userIdResponse = UserOuterClass.FindByUserIdResponse
                    .newBuilder()
                    .setUser(UserOuterClass.FindByUserIdResponse.User
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

            response.onNext(userIdResponse);
            response.onCompleted();
    }
}
