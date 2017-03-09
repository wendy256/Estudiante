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
public abstract class Energias extends Estudiante {
    
        double Marino;
     
    public Energias (double Marino){
        
    this.Marino=Marino;
    
    } 

@Override
public double getColor() {
 
    return Marino; 
      
}

}
    
 
