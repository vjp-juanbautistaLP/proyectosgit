/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11y12;

/**
 *
 * @author Juan
 */
public class Mueble {

    private double precio;
    private String descripcion;

    //Constructor por defecto
    public Mueble() {
        precio = 0.0;
        descripcion = "";
    }

    //Constructor paramatrizado
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    //Getters
    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    //Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Mostrar
    @Override
    public String toString() {
        return "Descripcion: " + descripcion + " | Precio: " + precio;
    }

}
