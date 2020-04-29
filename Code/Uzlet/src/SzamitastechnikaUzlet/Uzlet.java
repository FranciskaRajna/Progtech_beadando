/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SzamitastechnikaUzlet;

import Observer.Kovet;
import Observer.Koveto;
import Observer.Observer;
import Prototype.HardverElemek;
import Prototype.Parameterek;
import Prototype.Szamitogep;
import java.util.ArrayList;

/**
 *
 * @author rajna
 */
public class Uzlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Observer
       /* 
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
      
        */
        //Prototype
        Parameterek parameter = new Parameterek(8000,"AMD");
        
        HardverElemek DELL = new HardverElemek("DELL",parameter);
        ArrayList<HardverElemek> elemek = new ArrayList<HardverElemek>();
        elemek.add(DELL);
        
        Szamitogep laptop = new Szamitogep("Laptop",elemek);
       
        Szamitogep asztaliGep = new Szamitogep("Asztali számítógép",elemek);
        
        ArrayList<Szamitogep> szamitogepek = new  ArrayList<Szamitogep>();
        szamitogepek.add(laptop);
        szamitogepek.add(asztaliGep);
        
        for(Szamitogep sz : szamitogepek){
            System.out.print(sz.getTipus() + " " );
             for(HardverElemek elem : sz.getElemek()){
                 System.out.println(elem.getGyarto() + " " + elem.getParameterek().getCPU() + " " + elem.getParameterek().getRAM()); 
            }   
             
        }
    } 
}
