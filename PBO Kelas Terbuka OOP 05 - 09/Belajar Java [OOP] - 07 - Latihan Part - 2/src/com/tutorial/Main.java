package com.tutorial;

// player
class Player{
    String name;
    double health;
    int level;
    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){

        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " ATTACKING " + opponent.name + " With power " + attackPower);
        opponent.defance(attackPower);
    }

    void defance(double attackPower){
//        akan mengambil demage
        double demage;
        if (this.armor.defancePower < attackPower){
            demage = attackPower - this.armor.defancePower;
        } else {
            demage = 0;
        }

        this.health -= demage;
        System.out.println(this.name + " GETS DEMAGE " + demage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// senjata
class Weapon{
    double attackPower;
    String name;

    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("weapon : " + this.name + " , attack : " + this.attackPower);
    }
}

// armor
class Armor{
    double defancePower;
    String name;

    Armor(String name, double defancePower){
        this.name = name;
        this.defancePower = defancePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , defance : " + this.defancePower);
    }
}

public class Main{

    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("Zaky",100);
        Player player2 = new Player("Miftah", 80);

        // membuat object weapon
        Weapon pedang  = new Weapon("pedang",15);
        Weapon panah = new Weapon("panah asmara", 10);

        // membuat object armor
        Armor bajuBesi = new Armor("Baju Besi",10);
        Armor gaun = new Armor("Gaun", 8);

        // player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();
        // player 2
        player2.equipWeapon(panah);
        player2.equipArmor(gaun);
        player2.display();

        System.out.println("\nPERTEMOURAN");
        System.out.println("\n EPISODE 1");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\n EPISODE 2");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}