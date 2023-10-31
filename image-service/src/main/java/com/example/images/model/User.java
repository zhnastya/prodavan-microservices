package com.example.images.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
    private Long id;
    private String email;
    private String phoneNumber;
    private String name;
    private boolean active;
    private String password;
    private LocalDateTime dateOfCreated;

    private Set<Role> roles = new HashSet<>();
//    private List<Product> products = new ArrayList<>();
//    private Set<Product> likesProd;

    public User(Long id, String email, String phoneNumber, String name, boolean active, String password, LocalDateTime dateOfCreated) {
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.active = active;
        this.password = password;
        this.dateOfCreated = dateOfCreated;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }


    @Override
    public String getUsername() {
        return email;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }


    @Override
    public boolean isAccountNonLocked() {
        return true;
    }


    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }


    @Override
    public boolean isEnabled() {
        return active;
    }
}
