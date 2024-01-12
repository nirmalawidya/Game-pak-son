/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

/**
 *
 * @author LENOVO
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Buat objek
        Player Hero = new Player();
        Player Enemy = new Player();
        
        //Memberi nilai atribut
        Hero.name = "Ucup " ;
        Hero.speed = 20 ;
        Hero.healthPoin = 15 ;
        Hero.shield = 10 ;
        Hero.damage = 5 ;
                
        Enemy.name = "Asep ";
        Enemy.speed = 35 ;
        Enemy.damage = 2 ;
        Enemy.healthPoin = 0 ;
        Enemy.shield = 5 ;
        
        
        Hero.run();
        Hero.attack();
        Hero.defense();
        
        Enemy.run();
        Enemy.attack();
        Enemy.defense();
                
        
        if(Hero.isDead()){
            System.out.println(Hero.name + "is Dead, Game Over :(");
        }
        
        
//        drone kiran = new drone();
//        kiran.energi = 10;
//        kiran.ketinggian = 100;
//        kiran.kecepatan = 60;
//        kiran.merek = "nokia";
//        
//        kiran.terbang();
//        kiran.matikanMesin();
//        kiran.turun();
//        kiran.belok();
//        kiran.maju();
//        kiran.mundur();
//        
//        Motor saya = new Motor();
//        saya.bensin = 10;
//        saya.kecepatan = 100;
//        saya.merek = "Satria Suzuki";
//        
//        saya.maju();
//        saya.matikanMesin();
//        saya.berhenti();
//        saya.belok();
//        saya.mundur();
}
}