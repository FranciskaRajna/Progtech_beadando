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
public class Parameterek {
    int RAM;
    String CPU;
    public int getRAM(){
        return RAM;
    }
    public String getCPU(){
        return CPU;
    }
    
    public Parameterek(int RAM, String CPU ){
        this.RAM=RAM;
        this.CPU=CPU;
    }
}
