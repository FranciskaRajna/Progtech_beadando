/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stratégia;

/**
 *
 * @author rajna
 */
public class Termek {
    private String id;
    private int ar;
	
    public Termek(String id, int ar){
        this.id=id;
        this.ar=ar;
    }

    public String getId() {
            return id;
    }
    public int getAr() {
        if(ar < 0 )
        {
            System.out.println("Az ár nem lehet negatív, adjon meg új árat.");
            return 0;
        }
         else
        {
          return this.ar;
        }
    }  
}
