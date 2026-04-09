/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06tema11;

/**
 *
 * @author juan
 */
public class Donacion {
    //Atributos
    private String nombrePersona;
    private float cantidad;
    
    //Constructores
    public Donacion() {
        nombrePersona = "";
        cantidad = 0f;
    }

    public Donacion(String nombrePersona, float cantidad) {
        this.nombrePersona = nombrePersona;
        this.cantidad = cantidad;
    }
    
    //Getters/Setters
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "NombrePersona: " + nombrePersona + "\nCantidad: " + cantidad;
    }
}