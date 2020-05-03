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
	//apply 5$ discount if book price is greater than 50
	if(sz.getAr() > 50){
		cost = sz.getAr()-5;
	}else cost = sz.getAr();
	System.out.println("Számítógép: " + "Id:" + sz.getId() + " " + " Ár:" + cost +"Ft");
	return cost;
    }

    @Override
    public int visit(Eger e) {
        int cost = e.getAr();
	System.out.println("Egér: " + "Id:" + e.getId() + " "  +  e.getName() + " Ár:"+cost +"Ft");
	return cost;
    }
    
}
