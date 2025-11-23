/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author Juan
 */
public class Alumno {
    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public String obtenerCalificacion() {
        if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota <= 6) {
            return "Bien";
        } else if (nota <= 8) {
            return "Notable";
        } else if (nota <= 10) {
            return "Sobresaliente";
        } else {
            return "Nota inválida";
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Calificación: " + obtenerCalificacion());
        System.out.println("-----------------------------");
    }

}
