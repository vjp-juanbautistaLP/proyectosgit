/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14.tema10;

/**
 *
 * @author Juan
 */
public class Alumno {
    private String nombre;
    private Asignatura[] asignaturas;
    
    //Constructor por defecto
    public Alumno(){
        nombre="";
        asignaturas = new Asignatura[3];
    }
    
    //Constructor parametrizado
    public Alumno(String nombre,Asignatura[] asignaturas){
        this.nombre=nombre;
        this.asignaturas = asignaturas;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + asignaturas + '}';
    }
    //CalcularMedia
    public float calcularMedia() {
        float suma = 0;

        for (Asignatura a : asignaturas) {
            suma += a.getNota();
        }

        return suma / asignaturas.length;
    }
}
    

