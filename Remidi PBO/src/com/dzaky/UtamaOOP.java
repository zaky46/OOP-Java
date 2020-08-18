package com.dzaky;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class UtamaOOP {
    public static void main(String[] args) {
        Films film = null;


        boolean ulang = true;

        while(ulang) {
            System.out.println("-------------");
            System.out.println("1. Lihat Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan :");
            Scanner scanner = new Scanner(System.in);

            int pil = scanner.nextInt();
            if(pil==1) {
                ArrayList al = FilmsCRUD.read();
                Iterator<Films> itr = al.iterator();
                while (itr.hasNext()) {
                    film = itr.next();
                    System.out.print(film.getId()+" ");
                    System.out.print(film.getJudul()+" ");
                    System.out.print(film.getSinopsis()+" ");
                    System.out.print(film.getSutradara()+" ");
                    System.out.print(film.getPemain()+" ");
                    System.out.println(film.getTahun()+" ");
                }
            }
            else if (pil==2) {
                scanner = new Scanner(System.in);
                film = new Films(0,"","","","",0);
                System.out.print("JUDUL :");
                film.setJudul(scanner.nextLine());
                System.out.print("SINOPSIS :");
                film.setSinopsis(scanner.nextLine());
                System.out.print("SUTRADARA :");
                film.setSutradara(scanner.nextLine());
                System.out.print("PEMAIN :");
                film.setPemain(scanner.nextLine());
                System.out.print("TAHUN :");
                film.setTahun(scanner.nextInt());
                FilmsCRUD.tambah(film);
            }
            else if (pil==3) {
                scanner = new Scanner(System.in);
                film = new Films(0,"","","","",0);
                System.out.print("ID :");
                film.setId(scanner.nextInt());
                scanner.nextLine();
                System.out.print("JUDUL :");
                film.setJudul(scanner.nextLine());
                System.out.print("SINOPSIS :");
                film.setSinopsis(scanner.nextLine());
                System.out.print("SUTRADARA :");
                film.setSutradara(scanner.nextLine());
                System.out.print("PEMAIN :");
                film.setPemain(scanner.nextLine());
                System.out.print("Tahun :");
                film.setTahun(scanner.nextInt());
                FilmsCRUD.edit(film);
            }else if (pil==4) {
                scanner = new Scanner(System.in);
                film = new Films(0,"","","","",0);
                System.out.print("ID :");
                film.setId(scanner.nextInt());
                FilmsCRUD.hapus(film);
            }else {
                ulang = false;
                System.out.println("Keluar");
            }
        }
    }
}