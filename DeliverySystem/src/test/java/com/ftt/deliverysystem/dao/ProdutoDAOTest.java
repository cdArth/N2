/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.models.ProdutoModel;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lukas
 */
public class ProdutoDAOTest {
    
    public ProdutoDAOTest() {
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        ProdutoDAO instance = new ProdutoDAO();

        ArrayList<ProdutoModel> result = instance.findAll();
        System.err.println(result.size());

        result.forEach(model -> {
            System.err.println(model.getNome());
        });
    }
    
}
