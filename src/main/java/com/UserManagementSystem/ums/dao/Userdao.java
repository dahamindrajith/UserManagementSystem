package com.UserManagementSystem.ums.dao;

import com.UserManagementSystem.ums.models.User;
import java.util.List;

public interface Userdao {


    String createUser(User user);
    
    List<User> getAllUser();

	String updateUser(User user, String userId);

	String deleteUser(String userId);
}
