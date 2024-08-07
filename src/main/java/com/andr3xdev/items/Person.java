package com.andr3xdev.items;

// Imports
import jakarta.persistence.*;
import java.time.LocalTime;

// Entity class for User
@Entity
@Table(name = "users")

public class Person {
    //* Attributes
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String name;
    private String email;
    private LocalTime register;
    private String status;
    private String password;

    //* Constructors

    public Person(String username, String name, String email, String password) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.register = LocalTime.now();
        this.status = "A";
        this.password = password;
    }

    public Person() {
    }

    //* Methods

    public void updateStatus(String status) {
        this.status = status;
    }

    public void deleteUser() {
        this.status = "I";
    }

    public void readUser() {
        System.out.println("ID: " + this.id);
        System.out.println("Username: " + this.username);
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Register: " + this.register);
        System.out.println("Status: " + this.status);
    }

    //* Setters and Getters
    // Setters

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalTime getRegister() {
        return register;
    }

    public String getStatus() {
        return status;
    }

    public String getPassword() {
        return password;
    }
}