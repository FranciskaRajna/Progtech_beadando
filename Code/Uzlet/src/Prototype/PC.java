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
public class PC implements Szamitogep{
    public PC(){
        System.out.println("A PC kész ");
    }
 
    @Override
    public Szamitogep clone() {
         System.out.println("A PC készül");
        PC pc = null;
        try {
            pc = (PC) super.clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pc;
    }
    
    @Override
    public String toString(){
        return "PC";
    }
}
