package com.UserManagementSystem.ums.service;

import com.UserManagementSystem.ums.models.User;
import java.util.List;

public interface UserService {

    String createUSer(User user);
    
    List<User> getAllUser();

}
