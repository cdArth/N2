/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.models.UserModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Arthur
 */
public class LoginDAO {

    public boolean FazerLogin(UserModel user) {
        boolean logon = false;

        return logon;
    }

    public UserModel ProcurarUser(String userName) {
        UserModel user = new UserModel();
        String sql = "select * from USUARIO where usuario = " + userName;
        ResultSet resultSet = DatabaseConnection.query(sql);
        try {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

}
