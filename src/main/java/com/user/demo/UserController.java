package com.user.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
//@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("admin/GetUsersData")
    public List<User> getAllUsers() {
        return userService.getUserData();
    }

    @GetMapping("user/getHello")
    public String getHello(){
        return "Hello";
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.findById(id); // Returns null if not found
    }

    @PostMapping("/CreateData")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }
}
