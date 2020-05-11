/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author rajna
 */
public class Observ implements Observer{

    private String name;
    private Subject subject;
	
    public Observ(String name){
        this.name=name;
    }
    
    @Override
    public void update() {
        String msg = (String) subject.getUpdate(this);
            
        if(msg == null){
            System.out.println(name+":: Nincs új üzenet."); 
        }else
            System.out.println(name+"::Közzétett üzenet::"+msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.subject=sub;
    }

    
    
}
