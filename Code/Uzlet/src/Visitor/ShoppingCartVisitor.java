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
public interface ShoppingCartVisitor {
    int visit(SzGep sz);
    int visit(Eger e);
}
