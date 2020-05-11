/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author rajna
 */
public class ObserverImp implements Subject {
  
    private ArrayList<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MEMBER = new Object();
    
    public  ObserverImp(){
       
        this.observers = new ArrayList<>();
    }
    
  
    @Override
    public void feliratkozas(Observer member) {
        if(member == null) throw new NullPointerException("Nincs követő.");
            synchronized (MEMBER) {
            if(!observers.contains(member)) observers.add(member);
	}
        System.out.println("Feliratkozás történt.");
    }

    @Override
    public void leiratkozas(Observer member) {
        synchronized (MEMBER) {
            observers.remove(member);
       	}
        System.out.println("Leiratkozás történt.");
    }

    @Override
    public void notifyObserver() {
        ArrayList<Observer> observersLocal = null;
	synchronized (MEMBER) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
        	this.changed=false;
	}
        for (Observer member : observersLocal) {
            member.update();
	}
    }
    @Override
    public Object getUpdate(Observer member) {
	return this.message;
    }
	
    public void postMessage(String msg){
        System.out.println("Üzenőfal frissült:"+msg);
	this.message=msg;
	this.changed=true;
	notifyObserver();
    }

    
}
