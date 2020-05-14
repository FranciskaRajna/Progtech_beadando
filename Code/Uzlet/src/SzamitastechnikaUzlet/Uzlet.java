/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SzamitastechnikaUzlet;



import Observer.Observ;
import Observer.Observer;
import Observer.ObserverImp;
import Prototype.HardverElemek;
import Prototype.Parameterek;
import Prototype.Szamitogep;
import Stratégia.Kosar;
import Stratégia.PayPalS;
import Stratégia.CreditCardS;
import Stratégia.Termek;
import TemplateMethod.BoltiVasarlas;
import TemplateMethod.NetesRendeles;
import TemplateMethod.Vasarlas;

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
       
        ObserverImp oldal = new ObserverImp();
        Observer k1 = new Observ("Zsolt");
        Observer k2 = new Observ("Franci");
        Observer k3 = new Observ("Bence");
        
        oldal.feliratkozas(k1);
        oldal.feliratkozas(k2);
        oldal.feliratkozas(k3);
        
        
        k1.setSubject(oldal);
        k2.setSubject(oldal);
        k3.setSubject(oldal);
        
        k1.update();
        k2.update();
        k3.update();
        
        oldal.postMessage("Új árú érkezett, részletek a honlapon.");
   
        oldal.leiratkozas(k1);
      
        
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
            System.out.print(sz.getType() + " " );
             for(HardverElemek elem : sz.getElements()){
                 System.out.println(elem.getGyarto() + " " + elem.getParameterek().getCPU() + " " + elem.getParameterek().getRAM()); 
            }   
             
        }
        
   
        //Stratégia
        
        Kosar k = new Kosar();
        Termek t1 = new Termek("1231",32);
        Termek t2 = new Termek("4321",42);
        k.addItem(t1);
        k.addItem(t2);
        k.fizetes(new PayPalS("rajnafranciska45@gmail.com","asdas"));
        
        k.fizetes(new CreditCardS("Rajna Franciska","23156346121","42356","321"));
        
        
        
        //Template method
       
        Vasarlas netes = new NetesRendeles(); 
        netes.Rendeles(false);
        
        System.out.println(); 
        
        Vasarlas bolti = new BoltiVasarlas(); 
        bolti.Rendeles(false); 
       
        
     
    } 
}
