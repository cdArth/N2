/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.controllers;

import com.ftt.deliverysystem.dao.EnderecoDAO;
import com.ftt.deliverysystem.dao.LoginDAO;
import com.ftt.deliverysystem.dao.UserDAO;
import com.ftt.deliverysystem.models.UserModel;

/**
 *
 * @author lukas
 */
public class UserController {

    private static boolean logon = false;

    public boolean FazerLogin(String user) {
        UserDAO dao = new UserDAO();
        if (logon) {
            return logon;
        }

        UserModel user1 = dao.find(user);
        logon = user1 == null;
        return logon;
    }
    public void Insert(UserModel model){
    UserDAO dao = new UserDAO();
    EnderecoDAO dao1 = new EnderecoDAO();
    
    if(dao.find(model.getEmail())==null){
        
    }
    }

}
