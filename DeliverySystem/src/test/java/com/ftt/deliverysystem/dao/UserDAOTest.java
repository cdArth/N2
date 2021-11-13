/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem.dao;

import com.ftt.deliverysystem.models.UserModel;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Random;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lukas
 */
public class UserDAOTest {

    public UserDAOTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testFindAll() {
        System.out.println("findAll");
        UserDAO instance = new UserDAO();
        ArrayList<UserModel> expResult = null;
        ArrayList<UserModel> result = instance.findAll();
        result.forEach(userModel -> {
            System.err.println(userModel.getEmail());
        });
        Assertions.assertTrue(result.size() != 0);
    }

    @Test
    public void testFind() {
        System.out.println("find");
        int id = 1;
        UserDAO instance = new UserDAO();
        UserModel expResult = null;
        UserModel result = instance.find(id);
        System.err.println(result.getEmail());
        Assertions.assertTrue(result != null);
    }

    @Test
    public void testInsert() {
        System.out.println("insert");
        UserModel um = new UserModel("123", "teste", "teste", Date.valueOf("2021-03-03"));
        UserDAO instance = new UserDAO();
        UserModel expResult = null;
        instance.insert(um);
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 3;
        String updateTest = String.valueOf(new Random().nextFloat());
        UserDAO instance = new UserDAO();
        UserModel user = instance.find(id);
        if (user == null) {
            Assertions.fail("Cannot pass update becaose user found is null");
        }
        user.setTelefone(updateTest);
        instance.update(user);

        UserModel newUser = instance.find(id);
        Assertions.assertEquals(updateTest, newUser.getTelefone());
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 4;
        UserDAO instance = new UserDAO();
        UserModel user = instance.find(id);
        instance.delete(user);
    }
}
