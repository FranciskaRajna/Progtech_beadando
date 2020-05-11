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
public class Szamitogep implements Prototype{
    
   private String type; //Asztali számítógép vagy laptop
   
   private ArrayList<HardverElemek> elements = null;
   
   public Szamitogep(String type,ArrayList<HardverElemek> elements){
       this.type=type;
       this.elements=elements;
   }

    
    public String getType() {
        return type;
    }
    public ArrayList<HardverElemek> getElements() {
        return elements;
    }
   
    @Override
    public Szamitogep clone(String tipus){
       ArrayList<HardverElemek> elements = new ArrayList<HardverElemek>();
       for(HardverElemek elem : elements){
           elements.add(elem);
       }
       Szamitogep sz = new Szamitogep(tipus,this.elements);
       return sz;
   }
   
  
}
