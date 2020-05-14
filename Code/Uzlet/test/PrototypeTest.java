/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Prototype.HardverElemek;
import Prototype.Parameterek;
import Prototype.Szamitogep;
import java.util.ArrayList;
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
public class PrototypeTest {
    
    public PrototypeTest() {
    }
    
    private Parameterek parameter;
    private HardverElemek Dell;
    private  ArrayList<HardverElemek> elemek;
    private Szamitogep laptop;
    private Szamitogep asztaliGep;
    private ArrayList<Szamitogep> szamitogepek;
    
    
    @Before
    public void setUp() {
          
        this.parameter = new Parameterek(8000,"AMD");
        
        this.Dell = new HardverElemek("DELL",parameter);
        this.elemek = new ArrayList<HardverElemek>();
        this.elemek.add(Dell);
        
        this.laptop = new Szamitogep("Laptop",elemek);
       
        this.asztaliGep = new Szamitogep("Asztali számítógép",elemek);
        
        this.szamitogepek = new  ArrayList<Szamitogep>();
        this.szamitogepek.add(laptop);
        this.szamitogepek.add(asztaliGep);
    }
   

    @Test
    public void ParameterekGetRAM(){

        assertEquals(8000, parameter.getRAM());
    }
    
    @Test
    public void ParameterekGetCPU(){
     
        assertNotEquals("Intel", parameter.getCPU());
    }
    
    @Test
    public void HardverElemekTest(){
     
        assertNotEquals(null, Dell.getGyarto());
        assertNotEquals(null, Dell.getParameterek());
    }
    
    @Test
    public void SzamitogepTest(){
     
        assertNotEquals(null,szamitogepek);
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
