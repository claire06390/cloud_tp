package com.example.tp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    //test

    @Autowired
    private UserRepository userRepository;
    @GetMapping("/world")
    public String helloWorld() {
        return "Hello World!";
    }

    @PostMapping("/user")
    public String createUser(@RequestBody UserDTO userDTO) {
        User user = new User(userDTO.getUsername(), userDTO.getEmail(),userDTO.getFirstName(),userDTO.getLastName());
        User userSave = userRepository.save(user);
        return userSave.toString();
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
