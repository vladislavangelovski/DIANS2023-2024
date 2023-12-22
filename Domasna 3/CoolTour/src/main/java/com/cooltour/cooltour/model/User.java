package com.cooltour.cooltour.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



@Data
@Entity
@Table(name = "user_accounts")
public class User{
    @Id
    @NotBlank
    public String username;
    @NotBlank
    public String password;
    @NotBlank
    public String firstName;
    @NotBlank
    public String lastName;
    @NotBlank
    public String email;
    @OneToMany
    private List<Object> objects;

    public User(String username, String password, String firstName, String lastName, String email) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.objects = new ArrayList<>();
    }

    public User() {
    }
}
