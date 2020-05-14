/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Stratégia.CreditCardS;
import Stratégia.Kosar;
import Stratégia.PayPalS;
import Stratégia.Termek;
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
public class StrategiaTest {
    
    public StrategiaTest() {
    }
   
    private  Kosar k ;
    private Termek t1;
    private Termek t2;
    
    @Before
    public void setUp() {
        
        this.k = new Kosar();
        this.t1 = new Termek("1231",32);
        this.t2 = new Termek("4321",42);
    }
    
    @Test
    public void TestTermekLetrehozas(){
        assertNotEquals(t1,null);
        assertNotEquals(t2,null);
    }
    
    @Test
    public void TestKosar(){
        
       assertNotEquals(k, null);
     
    }
     @Test
    public void Test(){
        
      assertFalse(this.t1.getAr() < 0);
      assertFalse(this.t2.getAr() < 0);
    }
    
        
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
