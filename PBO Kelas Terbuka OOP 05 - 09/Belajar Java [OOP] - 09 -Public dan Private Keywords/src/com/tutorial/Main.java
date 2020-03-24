package com.tutorial;

class Player {
    String name; // default, dia akan bisa dibaca dan di tulis
    public int exp; // Public, akan sama dengan default(dia akan bisa di baca dan ditulis)
    private int health; // ini adalah private,(hanya akan bisa di tulis di dalam class saja)


    Player(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

//    default modifier access
    void display(){
        tambahExp(); // contoh mwngakses private Methods
        System.out.println("\nName\t : " + this.name);
        System.out.println("exp\t : " + this.exp);
        System.out.println("Health\t : " + this.health); // membaca tapi di dalam class
    }

//    Public
    public void ubahName(String nameBaru){
        this.name = nameBaru;
    }

//    private
    private void tambahExp(){
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args){

        Player player1 = new Player("Miftah",0, 100);

//        default
        System.out.println(player1.name); // Membaca data
        player1.name = "Dzaky"; // menulis data
        System.out.println(player1.name); // Membaca data

//        Public
        System.out.println(player1.exp); // Membaca data
        player1.exp = 100; // menulis data
        System.out.println(player1.exp); // Membaca data

//        Private (Tidak bisa di akses)
//        System.out.println(player1.health); // Membaca data
//        player1.health = 100; // menulis data
//        System.out.println(player1.health); // Membaca data

//        Methods

//        default
        player1.display();

//        public
        player1.ubahName("Tejo");
        player1.display();

//        private(TIDAK BISA DI ACCESS)
//        player1.tambahExp();



    }
}
