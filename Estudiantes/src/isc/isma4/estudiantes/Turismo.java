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
public abstract class Turismo extends Estudiante{
    
    double Amarillo;
    
    public Turismo (double Amarillo){
        
        this.Amarillo=Amarillo;
        
    }
    
 @Override
    public double getColor() {
        return Amarillo;
    }
    
}   
    
  
