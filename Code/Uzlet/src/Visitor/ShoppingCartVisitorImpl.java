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
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{

    @Override
    public int visit(SzGep sz) {
        int cost=0;
	
	if(sz.getPrice() > 50){
		cost = sz.getPrice()-5;
	}else cost = sz.getPrice();
	System.out.println("Számítógép: " + "Id:" + sz.getId() + " " + " Ár:" + cost +"Ft");
	return cost;
    }

    @Override
    public int visit(Eger e) {
        int cost = e.getPrice();
	System.out.println("Egér: " + "Id:" + e.getId() + " "  +  e.getName() + " Ár:"+cost +"Ft");
	return cost;
    }
    
}
