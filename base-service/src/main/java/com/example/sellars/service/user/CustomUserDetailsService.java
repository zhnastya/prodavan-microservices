package com.example.sellars.service.user;

import com.example.sellars.dto.User;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import users.UserOuterClass;
import users.UserServiceGrpc;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    @GrpcClient("user-service")
    private UserServiceGrpc.UserServiceBlockingStub stub;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserOuterClass.FindByUserEmailRequest request = UserOuterClass.FindByUserEmailRequest.newBuilder()
                .setEmail(email)
                .build();
        UserOuterClass.FindUserByAttribute response = stub.findByEmail(request);
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