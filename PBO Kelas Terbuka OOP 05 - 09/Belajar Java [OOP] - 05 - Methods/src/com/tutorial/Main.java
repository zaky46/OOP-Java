package com.tutorial;

class Mahasiswa{
    //    Data Number
    String nama;
    String nim;
    //    construktor
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;

    }
    //    Method tanpa return dan tanpa parameter
    void show(){
        System.out.println("nama    : " + this.nama);
        System.out.println("nim     : " + this.nim);
    }
    //    method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }
    //    Method dengan return tapi tidak ada paramater
    String getNama(){
        return this.nama;
    }
    String getNim(){
        return this.nim;
    }
    //    method dengan return dan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah" + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Dzaky", "181220091");
//      method
        mahasiswa1.show();
        mahasiswa1.setNama("Fitrah");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNim());

        String data = mahasiswa1.sayHi("ganteng");
        System.out.println(data);

    }
}
