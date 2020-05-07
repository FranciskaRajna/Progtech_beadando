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
public  class Calculator {
    public static int calculatePrice(ItemElement[] termekek) {
        
	ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
	int sum=0;
	for(ItemElement termek : termekek){
            sum = sum + termek.accept(visitor);
	}
	return sum;
    }

    
}
