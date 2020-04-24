/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopok;

/**
 *
 * @author rajna
 */
public class Laptopok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      AlapLaptop l1 = new AlapLaptop("ASUS","IntelI3",500);
        System.out.println(l1.kiir());
        
      AlapLaptop l2 = new GamerLaptop("Predator", "intelI7",12000);
         System.out.println(l2.kiir());
         
     
    }
    
}
