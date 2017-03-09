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
public abstract class Sistemas extends Estudiante{
    
    double Azul;
    
    public Sistemas (double Azul){
        
        this.Azul=Azul;
        
    }
    
    @Override
    public double getColor() {
        return Azul;
    }
    
}
