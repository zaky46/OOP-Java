package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args){
        Buku buku1 = new Buku("KAMUS DASAR ISLAM", "Muhammad Iqbal");
        buku1.display();

//      Menampilkan Address
        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println(addressBuku1);

//       Assigment Object
        Buku buku2 = buku1;
        buku2.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println(addressBuku2);

//      Karena buku1 dan buku2 berada pada address atau referensi yang sama
        buku2.judul = "KAMUS ISLAM";
        buku1.display();
        buku2.display();

//      memasukan object kedalam Mothod
        fungsi(buku2);
        buku1.display();
        buku2.display();

    }

    public  static  void fungsi(Buku dataBuku){
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("addres dalam fungsi" + addressDataBuku);
        dataBuku.penulis = "Harukui muhalkai";
    }
}
