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
public abstract class Administración extends Estudiante {
   
    double Rojo;
     
    public Administración (double Rojo){
        
    this.Rojo=Rojo;
    
    } 

@Override
public double getColor() {
 
    return Rojo; 
      
}

}










