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
public class NetesRendeles extends Vasarlas{
    @Override
    public void valasztas() 
    { 
        System.out.println("Termék kosárba rakva."); 
        System.out.println("Adja meg a szállítási címet."); 
    } 
  
    @Override
    public void fizetes() 
    { 
        System.out.println 
          ("Online kártyás fizetés."); 
    } 
  
    @Override
    public void szallitas() 
    { 
        System.out.println 
         ("Postai úton szállítva."); 
    }   

    
}
