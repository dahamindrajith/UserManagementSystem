package com.UserManagementSystem.ums.service.impl;

import com.UserManagementSystem.ums.dao.Userdao;
import com.UserManagementSystem.ums.models.User;
import com.UserManagementSystem.ums.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

@Autowired
    Userdao userdao;

public String createUSer(User user){
    return userdao.createUser(user);
}

public List<User> getAllUser(){
    return userdao.getAllUser();
}

}
