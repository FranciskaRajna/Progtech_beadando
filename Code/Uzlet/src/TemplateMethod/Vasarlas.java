/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author rajna
 */
public abstract class Vasarlas {
    
    public boolean ajandek; 
  
    public abstract void valasztas(); 
  
    public abstract void fizetes(); 
  
    public void csomagolas() 
    { 
        try
        { 
            System.out.println("Ajándék csomagolásba került"); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Nem került ajándék csomagolásba."); 
        } 
    } 
  
    public abstract void szallitas(); 
  
    public void Rendeles(boolean ajandek) 
    { 
        valasztas(); 
        fizetes(); 
      
        if (ajandek) { 
            csomagolas(); 
        } 
        szallitas(); 
    } 
}     

