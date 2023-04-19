package com.UserManagementSystem.ums.dao.impl;

import com.UserManagementSystem.ums.DBConnection.DbConnection;
import com.UserManagementSystem.ums.dao.Userdao;
import com.UserManagementSystem.ums.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Properties;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class UserdaoImpl implements Userdao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    Properties properties;

    public String createUser(User user) {

        System.out.println(user.getDiscription());
        String rtn = "Faill";
        
        int checkAvail=checkAvailability(user.getRequstId(),user.getUserId());
        try {

            if(checkAvail==0){
                
            String sql = "INSERT INTO ums_main(rqst_id, user_id, name, discription, status) VALUES (?, ?, ?, ?, ?)";
            int result = jdbcTemplate.update(sql, user.getRequstId(), user.getUserId(), user.getName(), user.getDiscription(), user.getStatus());

            if (result > 0) {
                rtn = "Success";
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rtn;
    }

    public List<User> getAllUser() {

        DbConnection conn = new DbConnection();
        Connection connection = conn.getConnection();

        List<User> allUsers = new ArrayList();

        try {

            ResultSet rs = connection.createStatement().executeQuery("SELECT name, rqst_id, user_id, discription FROM ums_main");

            while (rs.next()) {

                User user = new User();

                user.setName(rs.getString(1));
                user.setRequstId(rs.getString(2));
                user.setUserId(rs.getString(3));
                user.setDiscription(rs.getString(4));

                allUsers.add(user);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return allUsers;
    }
    
    private int checkAvailability(String rqstId, String userId){
        
        DbConnection conn = new DbConnection();
        Connection connection = conn.getConnection();
        int rtnVlue=0;
        
        try {
            
            String sql="SELECT name FROM ums_main WHERE rqst_id=?";
            
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, userId);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                
                rtnVlue=1;
                
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return rtnVlue;
        
    }

}
