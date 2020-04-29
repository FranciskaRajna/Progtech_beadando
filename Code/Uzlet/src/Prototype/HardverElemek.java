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
public class HardverElemek {
    String gyarto;
    Parameterek parameterek;
    
    public String getGyarto(){
        return gyarto;
    }
     public Parameterek getParameterek(){
        return parameterek;
    }
    public HardverElemek(String gyarto, Parameterek parameterek){
        this.gyarto=gyarto;
        this.parameterek=parameterek;
    }
    
}
