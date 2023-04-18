package com.UserManagementSystem.ums.controller;

import com.UserManagementSystem.ums.models.User;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user")
@CrossOrigin(origins = {"*"})
public interface IUserController {

    @PostMapping("/adduser")
    ResponseEntity<String> createUSer(@RequestBody User user);
    
    @GetMapping("/getall")
    ResponseEntity<List<User>> getAllUser();

}
