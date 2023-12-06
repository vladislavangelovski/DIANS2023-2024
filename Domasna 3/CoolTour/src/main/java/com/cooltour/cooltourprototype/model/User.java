package com.cooltour.cooltourprototype.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "user_accounts")
public class User {
    @Id
    public String username;
    public String password;
    public String firstName;
    public String lastName;
    @OneToMany
    private List<Object> objects;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.objects = new ArrayList<>();
    }

    public User() {
    }
}
