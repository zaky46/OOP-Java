package com.dzaky;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FilmsCRUD {
    public static ArrayList read()
    {
        ArrayList al = new ArrayList();
        Films f = null;
        try
        {
            Connection conn = KoneksiDB.connect();
            Statement stmt = null;
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from film");
            while(rs.next())
            {
                int id = rs.getInt("id");
                String judul = rs.getString("judul");
                String sinopsis = rs.getString("sinopsis");
                String sutradara = rs.getString("sutradara");
                String pemain = rs.getString("pemain");
                int tahun = rs.getInt("tahun");
                f = new Films(id,judul,sinopsis,sutradara,pemain,tahun);
                al.add(f);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }

        return al;
    }

    public static void tambah(Films film) {
        try
        {
            Connection conn = KoneksiDB.connect();
            Statement stmt = null;
            stmt = conn.createStatement();
            String tambahData = "insert into film(judul,sinopsis,sutradara,pemain,tahun) values ('"+film.getJudul()+"','"+film.getSinopsis()+"','"+film.getSutradara()+"','"+film.getPemain()+"',"+film.getTahun()+")";
//			System.out.println(tambahData);
            stmt.executeUpdate(tambahData);
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }

    }
    public static void edit(Films film) {
        try
        {
            Connection conn = KoneksiDB.connect();
            Statement stmt = null;
            stmt = conn.createStatement();
            String editData = "update film set judul='"+film.getJudul()+"',sinopsis='"+film.getSinopsis()+"',sutradara='"+film.getSutradara()+"',pemain='"+film.getPemain()+"',tahun="+film.getTahun()+" where id = "+ film.getId();
//			System.out.println(editData);
            stmt.executeUpdate(editData);
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }

    }
    public static void hapus(Films film) {
        try
        {
            Connection conn = KoneksiDB.connect();
            Statement stmt = null;
            stmt = conn.createStatement();
            String hapusData = "delete from film where id = "+ film.getId();
            System.out.println(hapusData);
            stmt.executeUpdate(hapusData);
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e.getMessage());
        }
    }
}