package com.dzaky;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    public static Connection connect() {
        Connection conn = null;
        try
        {
            String url = "jdbc:sqlite:C:\\Users\\zaky\\Desktop\\Remidi PBO\\src\\db\\film.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite.");

        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
