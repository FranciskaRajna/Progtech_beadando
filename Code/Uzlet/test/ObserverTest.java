/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Observer.Observ;
import Observer.Observer;
import Observer.ObserverImp;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rajna
 */
public class ObserverTest {
    
    public ObserverTest() {
    }
   
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void Observer(){
        ObserverImp oldal = new ObserverImp();
        assertNotEquals(oldal,null);
        Observer k1 = new Observ("Zsolt");
         assertNotEquals(k1,null);
        Observer k2 = new Observ("Franci");
        assertNotEquals(k2,null);
        
        oldal.feliratkozas(k1); 
        oldal.feliratkozas(k2);
        
        k1.setSubject(oldal);
        k2.setSubject(oldal);

        k1.update();
        k2.update();
    
        oldal.postMessage("Új árú érkezett, részletek a honlapon.");
   
        oldal.leiratkozas(k1);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
