package com.example.tp1;

import jakarta.persistence.*;
@Entity
@Table(name = "user", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String firstname;
    private String lastname;

    public User() {

    }

    public User(String username, String email, String firstName, String lastName) {
        this.username = username;
        this.email = email;
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }


    @Override
    public String toString() {
        return "User [username=" + username +  ", email=" + email + ", firstName=" + firstname + ", lastName=" + lastname  + "]";
    }

}
