/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.tema8;

/**
 *
 * @author Juan
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    
    //Constructor por defecto
    public Empleado(){
        nombre = "";
        horasTrabajadas = 0;
        tarifaHora = 0.0;
    }
    //Constructor parametrizado

    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    
    //Getters

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    
    
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }
    
    //Metodo para calcularSueldo
     public double calcularSueldo() {
        double sueldo;
        //Si trabaja 40 horas o menos; cobra tarifa normal
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifaHora;
        //Si trabaja más de 40 horas ,las horas extra se pagan a 1.5
        } else {
            int horasExtra = horasTrabajadas - 40;
            sueldo = (40 * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
        //Devuelve el sueldo calculado
        return sueldo;
    }
    
    //Mostrar

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", horasTrabajadas=" + horasTrabajadas + ", tarifaHora=" + tarifaHora + '}';
    }
     
}
