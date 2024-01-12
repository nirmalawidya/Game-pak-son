/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author LENOVO
 */
public class Motor {
    //atribut
    int bensin;
    int kecepatan;
    String merek;
    
    //method
    void maju(){
        bensin--;
        if (bensin < 10){
            kecepatan++;
            System.out.println("Motor gas ngengg...");
        }else{
            System.out.println("Bensin habis : motornya haus tidak bisa di gas");
        }
    }
    
    void matikanMesin(){
        if(kecepatan > 0){
            System.out.println("Mesin tidak bisa mati karena sedang di gas");
        }else{
            System.out.println("Mesin dimatikan...");
        }
    }
    
    void berhenti(){
        //kecepatan berkurang, karena motor direm
        kecepatan--;
        bensin--;
        System.out.println("Motor berhenti");
    }
    
    void belok(){
        bensin--;
        System.out.println("Motor belok");
        //belok ke mana? ya gtw ^_^
    }
    
    void mundur(){
        bensin--;
        System.out.println("Motor mundur");
        kecepatan++;
    }
}
