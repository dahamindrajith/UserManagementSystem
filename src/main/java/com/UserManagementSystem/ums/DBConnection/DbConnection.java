/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UserManagementSystem.ums.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CHAMA COMPUTERS
 */
public class DbConnection {

    public Connection getConnection() {

        Connection con = null;
        try {

            String connectPath = "jdbc:mysql://127.0.0.1:3306/common?autoReconnect=true";
            String username = "root";
            String password = "DaHaMPusH@1120";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    connectPath, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}
