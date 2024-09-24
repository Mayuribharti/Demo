package com.user.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class User {

    @Id
    private Long id;
    private String username;
    private String password; // You might want to hash this in real applications
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    // You can add more fields as needed
}