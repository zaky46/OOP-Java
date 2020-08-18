package com.dzaky;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Utama {

    public static void readData()
    {
        try
        {
            Connection conn = KoneksiDB.connect();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Film");
            while(rs.next())
            {
                int id = rs.getInt("id");
                String judul = rs.getString("judul");
                String sinopsis = rs.getString("sinopsis");
                String sutradara = rs.getString("sutradara");
                String pemain = rs.getString("pemain");
                int tahun = rs.getInt("tahun");
                System.out.println(id+" "+judul+" "+sinopsis+" "+sutradara+" "+pemain+" "+pemain+" "+tahun);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        readData();
    }
}
