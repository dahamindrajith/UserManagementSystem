package com.UserManagementSystem.ums.controller;

import com.UserManagementSystem.ums.models.User;
import com.UserManagementSystem.ums.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements IUserController{

@Autowired
UserService userService;

    @Override
    public ResponseEntity<String> createUSer(User user) {
        return new ResponseEntity<>(userService.createUSer(user), HttpStatus.OK);
    }
    @Override
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<>(userService.getAllUser(),HttpStatus.OK);
    }
    @Override
    public ResponseEntity<String> updateUser(@RequestBody User user, @PathVariable String userId){
		return new ResponseEntity<>(userService.updateUser(user,userId),HttpStatus.OK);
    	
    }
    @Override
    public ResponseEntity<String> deleteUser(@PathVariable String userId) {
    	return new ResponseEntity<>(userService.deleteUser(userId),HttpStatus.OK);
    }
    
}
