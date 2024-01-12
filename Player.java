/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author LENOVO
 */
public class Player {
    //atribut
    String name;
    int speed, healthPoin, damage, shield;
    
    //method
    void run(){
        System.out.println( name + "is running...");
        System.out.println( "Speed " + speed );
    }
    
    void attack(){
        System.out.println("Kena damage " + damage + " bang ");
    }
    
    void defense(){
        System.out.println("Shield " + shield);
    }
    
    boolean isDead(){
        if(healthPoin <= 0)
            return true;
        return false;
    }
}
