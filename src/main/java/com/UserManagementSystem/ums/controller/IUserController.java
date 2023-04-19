package com.UserManagementSystem.ums.controller;

import com.UserManagementSystem.ums.models.User;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("user")
@CrossOrigin(origins = {"*"})
public interface IUserController {

    @PostMapping("/adduser")
    ResponseEntity<String> createUSer(@RequestBody User user);
    
    @GetMapping("/getall")
    ResponseEntity<List<User>> getAllUser();
    
    @PutMapping("/update/{userId}")
    ResponseEntity<String> updateUser(@RequestBody User user, @PathVariable String userId);
    
    @PutMapping("/inactuser/{userId}")
    ResponseEntity<String> deleteUser(@PathVariable String userId);

}
