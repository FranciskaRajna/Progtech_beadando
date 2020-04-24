/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopok;

/**
 *
 * @author rajna
 */
public  class AlapLaptop implements Expandable
{
    private String tipus;

    
    public String getTipus() {
        return tipus;
    }
   
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    
    public String CPU;
    
    public String getCPU() {
        return CPU;
    }
   
    public void setCPU (String CPU) {
        this.CPU = CPU;
    }
    
    public int RAM;
    public int getRAM(){
        return RAM;
    }
    
    public void setRAM(int RAM){
        this.RAM = RAM;
    }
     public AlapLaptop(String tipus, String CPU, int RAM ){
        this.tipus = tipus;
        this.CPU= CPU;
        this.RAM = RAM;
    }

   
    public String kiir()
    {
        return tipus + " " + CPU + " " + RAM ;
    }

    @Override
    public String bővíthető() {
      return "bővíthető";
    }
}
