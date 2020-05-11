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
public class CreditCardS implements FizetesiStrategia{
     //implementálom a bankkártyával történő fizetést.
    private String nev;
    private String kartyaszam;
    private String cvv;
    private String lejarat;
	
    public CreditCardS(String nev, String ksz, String cvv, String lejarat){
            this.nev=nev;
            this.kartyaszam=ksz;
            this.cvv=cvv;
            this.lejarat=lejarat;
    }
    @Override
    public void fizetes(int osszeg) {
            System.out.println(osszeg+ " Ft," + "hitelkártyával fizetve. ");
    }

}
