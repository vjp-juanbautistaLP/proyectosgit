/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14.tema10;

/**
 *
 * @author Juan
 */
public class Asignatura {
    private String nombre;
    private float nota;
    
    //Constructor por defecto
    public Asignatura(){
        nombre= "";
        nota = 0;
    }
    //Constructor parametrizado
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
