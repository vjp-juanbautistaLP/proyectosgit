/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04tema6;

/**
 *
 * @author juanb
 */
public abstract class Animal {
    //Atributos
    private String nombre;
    private int edad;
    private double peso;
    
    //Constructores
    public Animal() {
        nombre = "";
        edad = 0;
        peso = 0;
    }
    
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //Getters/Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    //Mostrar
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Peso: " + peso + " kg");
    }
    
    //Métodos abstractos
    public abstract String sonido();
    public abstract String alimentacion();
    public abstract String habitat();
    public abstract String nombreCientifico();
}