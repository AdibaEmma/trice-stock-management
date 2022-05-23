package com.aweperi.stockmanagement;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection implements Serializable {

    private String url = "jdbc:postgresql://localhost:5432/triceStockDB";
    private String user = "postgres";
    private String password = "postgres";

    public DatabaseConnection() {
    }
    public Connection connect() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}