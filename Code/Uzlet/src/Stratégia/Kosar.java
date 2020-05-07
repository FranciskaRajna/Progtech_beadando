/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stratégia;

import java.util.ArrayList;

/**
 *
 * @author rajna
 */
public class Kosar {
   ArrayList<Termek> termekek;
	
	public Kosar(){
		this.termekek=new ArrayList<Termek>();
	}
	
	public void addItem(Termek t){
		this.termekek.add(t);
                System.out.println(termekek.size() + " termék a kosárban.");
	}
	
	public void removeItem(Termek t){
		this.termekek.remove(t);
	}
	
	public int vegOsszeg(){
		int o = 0;
		for(Termek t : termekek){
			o += t.getAr();
		}
		return o;
	}
	
	public void fizetes(FizetesiStrategia fizet){
		int osszeg = vegOsszeg();
		fizet.fizetes(osszeg);
	}
}
