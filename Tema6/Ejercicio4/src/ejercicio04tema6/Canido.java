/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author juanb
 */
public abstract class Canido extends Animal {
    //Constructores
    public Canido(){
        super();
    }
    
    public Canido(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    //No pongo ni getters ni setters porque se hereda todo excepto los constructores
    
    //Mostrar
    @Override
    public String toString() {
        return "Canido{" + '}';
    }
    
    }
