/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SzamitastechnikaUzlet;

import Observer.Kovet;
import Observer.Koveto;
import Observer.Observer;
import Prototype.Laptop;
import Prototype.cloneFactory;

/**
 *
 * @author rajna
 */
public class Uzlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Kovet koveto = new Kovet();
        Observer k1 = new Koveto("Zsolt");
        Observer k2 = new Koveto("Franci");
        Observer k3 = new Koveto("Bence");
        
        koveto.feliratkozas(k1);
        koveto.feliratkozas(k2);
        koveto.feliratkozas(k3);
        
        
        k1.setSubject(koveto);
        k2.setSubject(koveto);
        k3.setSubject(koveto);
        
        k1.update();
        k2.update();
        k3.update();
        
        koveto.postMessage("Új árú érkezett, részletek a honlapon.");
   
        koveto.leiratkozas(k1);
      
        
        
        /* cloneFactory szamitogep = new cloneFactory();
        Laptop l1 = new Laptop("Asus");
        Laptop cloneLaptop = (Laptop)szamitogep.getClone(l1); */
    }
    
}
