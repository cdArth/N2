/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.controllers;

import com.ftt.deliverysystem.dao.EnderecoDAO;
import com.ftt.deliverysystem.dao.UserDAO;
import com.ftt.deliverysystem.dao.util.HelperDAO;
import com.ftt.deliverysystem.models.ClienteModel;
import com.ftt.deliverysystem.models.EnderecoModel;
import com.ftt.deliverysystem.models.UserModel;
import java.util.ArrayList;

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

    public void Insert(UserModel user, EnderecoModel adress, ClienteModel cliente) {
        HelperDAO hdao = new HelperDAO();
        UserDAO dao = new UserDAO();
        if (hdao.checkUC(user, cliente)) {
            dao.insert(user);
        }
    }

    public void Update(UserModel user) {

        UserDAO dao = new UserDAO();
        user.setId(dao.find(user.getEmail()).getId());
        dao.update(user);
    }

    public void Delete(UserModel user) {
        UserDAO dao = new UserDAO();
        dao.delete(user);

    }

    public ArrayList<UserModel> Listar() {
        UserDAO dao = new UserDAO();
        ArrayList<UserModel> lista = dao.findAll();
        return lista;

    }
}
