/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author rajna
 */
public class Eger implements ItemElement{
     private int ar;
    public int getAr() {
        return ar;
    }
    private int id;
    
    public int getId() {
        return id;
    }
    
    private String name;
    public String getName(){
	return this.name;
    }
   public Eger(int ar, int id,String nev){
        this.ar=ar;
        this.id=id;
        this.name = nev;
    }
    
    @Override
    public int accept(ShoppingCartVisitor visitor) {
       return visitor.visit(this);

    }
	
   
}
