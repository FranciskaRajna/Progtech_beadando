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
public class SzGep implements ItemElement {
    private int price;
    public int getPrice() {
        return price;
    }
    private int id;
    
    public int getId() {
        return id;
    }

    public SzGep(int ar, int id){
        this.price=price;
        this.id=id;
    }
    @Override
    public int accept(ShoppingCartVisitor visitor){
       return visitor.visit(this);
    }

    
   
    
}
