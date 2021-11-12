/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.models.UserModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Arthur
 */
public class LoginDAO {
    public boolean FazerLogin(UserModel user){
        boolean logon =false;
        
        return logon;
    } 
    public UserModel ProcurarUser(String userName){
        UserModel user = new UserModel();
        String sql= "select * from USUARIO where usuario = " + userName;
        ResultSet resultSet = null;

        try (Connection connection = DatabaseConnection.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT TOP 10 Title, FirstName, LastName from SalesLT.Customer";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        return user;
    }
    
}
