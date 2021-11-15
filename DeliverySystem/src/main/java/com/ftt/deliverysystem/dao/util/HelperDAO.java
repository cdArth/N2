/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ftt.deliverysystem.dao.util;


        
import com.ftt.deliverysystem.models.ClienteModel;

import com.ftt.deliverysystem.models.UserModel;
import com.ftt.deliverysystem.dao.EnderecoDAO;
import com.ftt.deliverysystem.dao.UserDAO;
import com.ftt.deliverysystem.dao.ClienteDAO;
import com.ftt.deliverysystem.models.ProdutoCategoriaModel;

/**
 *
 * @author Arthur
 */
public class HelperDAO {
    public boolean checkUC(UserModel user, ClienteModel cliente){
        boolean check=false;
        UserDAO daoUser = new UserDAO();
        EnderecoDAO daoEndereco = new EnderecoDAO();
        ClienteDAO daoCliente = new ClienteDAO();
        if(daoUser.find(user.getEmail())==null
                && daoCliente.find(cliente.getCpf())==null){
            check=true;
        }
    return check;
    }
    public boolean checkProduto(ProdutoCategoriaModel produto){
        boolean check=false;
    return check;
    }
}
