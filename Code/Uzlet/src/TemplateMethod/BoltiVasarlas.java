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
public class BoltiVasarlas extends Vasarlas {

    @Override
    public void valasztas() {
        System.out.println("A vásárló kiválasztja a terméket a boltból."); 
    }

    @Override
    public void fizetes() {
        System.out.println("A vásárló a kasszánál fizet."); 
    }

    @Override
    public void szallitas() {
          System.out.println("A vásárló elvitte magával."); 
    }

   
}
