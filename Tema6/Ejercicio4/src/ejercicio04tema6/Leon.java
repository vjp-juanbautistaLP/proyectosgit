/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author juanb
 */
public class Leon extends Felino {
    //Constructores
    public Leon(){
        super();
    }
    
    public Leon(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
    }
    
    //Implementación del método abstracto sonido()
    @Override
    public String sonido() {
        return "Rugido";
    }
    //Implementación del método abstracto alimentacion()
    @Override
    public String alimentacion() {
        return "Carnivora";
    }
    //Implementación del método abstracto habitat()
    @Override
    public String habitat() {
        return "Sabana";
    }
    //Implementación del método abstracto nombreCientifico()
    @Override
    public String nombreCientifico() {
        return "Panthera leo";
    }
}