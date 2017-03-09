/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.estudiantes;

/**
 *
 * @author Alvarez
 */
public  abstract class Industrias extends Estudiante {
    
    double Negro;
    
    public Industrias (double Negro){
        
        this.Negro=Negro;
        
    }
    
   @Override
  public double getColor(){
      
     return Negro;
      
  }

}
