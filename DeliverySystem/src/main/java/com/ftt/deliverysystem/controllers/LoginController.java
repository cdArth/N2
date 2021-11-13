/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.controllers;

import com.ftt.deliverysystem.dao.LoginDAO;

/**
 *
 * @author lukas
 */
public class LoginController {

    public boolean FazerLogin(String user) {
        LoginDAO dao = new LoginDAO();
//        UserModel user = dao.ProcurarUser(user);
        return dao.FazerLogin(user);
    }

}
