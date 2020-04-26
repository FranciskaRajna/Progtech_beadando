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
public class Koveto implements Observer{

 private String name;
 private Subject subject;
	
    public Koveto(String name){
            this.name=name;
    }
    
    @Override
    public void update() {
        
        
            String msg = (String) subject.getUpdate(this);
            
            if(msg == null){
                    System.out.println(name+":: No new message");
            }else
            System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void setSubject(Subject sub) {
            this.subject=sub;
    }

    
    
}
