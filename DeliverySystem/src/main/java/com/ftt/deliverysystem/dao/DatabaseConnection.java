package com.ftt.deliverysystem.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lukas
 */
public class DatabaseConnection {

    private static DatabaseConnection uniqueInstance;
    private static Connection connection;

    public static synchronized DatabaseConnection getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DatabaseConnection();
        }
        
        connection = getConnection();

        return uniqueInstance;
    }

    private static Connection createConnection() {
        String connectionUrl
                = "jdbc:sqlserver://localhost:19288;instanceName=sql1"
                + "database=6BI_N2;"
                + "user=dbuser;"
                + "password=dbuser@123;";

        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.err.println("banco conectado");
            return connection;
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.err.println("erro na conexão com o banco");
            connection = null;
            e.printStackTrace();
            return null;
        }
    }
    
    public static Connection getConnection(){
        if(connection == null)
            connection = createConnection();
        return connection;
    }
    
    public static ResultSet query(String queryString) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryString);
            return preparedStatement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
