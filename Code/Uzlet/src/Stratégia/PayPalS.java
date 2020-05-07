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
public class PayPalS implements FizetesiStrategia{
    //implementálom a paypal-al történő fizetést.
    private String emailId;
    private String jelszo;
   
    public PayPalS(String email, String jelszo){
        this.emailId=email;
        this.jelszo=jelszo;
    }
    @Override
    public void fizetes(int osszeg) {
        System.out.println(osszeg + "Ft, Paypal használatával.");
    }
}
