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
     private int price;
    public int getPrice() {
        return price;
    }
    private int id;
    
    public int getId() {
        return id;
    }
    
    private String name;
    public String getName(){
	return name;
    }
   public Eger(int price, int id,String name){
        this.price=price;
        this.id=id;
        this.name = name;
    }
    
    @Override
    public int accept(ShoppingCartVisitor visitor) {
       return visitor.visit(this);

    }
	
   
}
