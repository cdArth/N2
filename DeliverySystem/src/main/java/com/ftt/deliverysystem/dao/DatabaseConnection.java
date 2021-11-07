package com.ftt.deliverysystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lukas
 */
public class DatabaseConnection {

    public Connection getConnection() {
        String connectionUrl
                = "jdbc:sqlserver://localhost:1433;"
                + "database=6BI_N2;"
                + "user=sa;"
                + "password=Lukas@123;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.err.println("banco conectado");
            return connection;
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.err.println("erro na conexão com o banco");
            e.printStackTrace();
            return null;
        }
    }
}
