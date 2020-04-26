/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author rajna
 */
public class Laptop implements Szamitogep{
    String gyarto;
    
    
    public Laptop(  String gyarto){
        this.gyarto = gyarto;
    }
 
    @Override
    public Szamitogep clone() {
         System.out.println("A laptop készül");
        Laptop laptop = null;
        try {
            laptop = (Laptop) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return laptop;
    }
    
    @Override
    public String toString(){
        return this.gyarto;
    }
}
