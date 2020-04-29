/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.ArrayList;

/**
 *
 * @author rajna
 */
public class Szamitogep {
    
   private String tipus; //Asztali számítógép vagy laptop
   
   private ArrayList<HardverElemek> elemek = null;
   
   public Szamitogep(String tipus,ArrayList<HardverElemek> elemek){
       this.tipus=tipus;
       this.elemek=elemek;
   }

    
    public String getTipus() {
        return tipus;
    }
    public ArrayList<HardverElemek> getElemek() {
        return elemek;
    }
    
   public Szamitogep clone(String tipus){
       ArrayList<HardverElemek> elemek = new ArrayList<HardverElemek>();
       for(HardverElemek elem : elemek){
           elemek.add(elem);
       }
       Szamitogep sz = new Szamitogep(tipus,this.elemek);
       return sz;
   }
   
  
}
