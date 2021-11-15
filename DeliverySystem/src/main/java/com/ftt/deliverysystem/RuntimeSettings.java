/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ftt.deliverysystem;

/**
 *
 * @author lukas
 */
public class RuntimeSettings {

    private static RuntimeSettings instance;
    public String value;

    private RuntimeSettings(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static RuntimeSettings getInstance(String value) {
        if (instance == null) {
            instance = new RuntimeSettings(value);
        }
        return instance;
    }
}
