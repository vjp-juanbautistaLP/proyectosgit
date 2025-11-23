/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author Juan
 */
public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;
    
    //Contructor : recibe los datos del empleado
    public Empleado(String nombre, int horasTrabajadas , double tarifaHora){
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    //Constructor por defecto
    public Empleado(){
        this.nombre = "";
        this.horasTrabajadas = 0;
        this.tarifaHora = 0;
    }
    
    //Getters
    public String getnombre(){
        return nombre;
    }
    public int gethorasTrabajadas(){
        return horasTrabajadas;
    }
    public double gettarifaHora(){
        return tarifaHora;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    } 
    public void sethorasTrabajadas(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
    public void settarifaHora(double tarifaHora){
        this.tarifaHora = tarifaHora;
        
    }
    
    // Método para calcular el sueldo bruto
    public double calcularSueldoBruto() {
        double sueldo;

        if (horasTrabajadas <= 40) {
            // Todas las horas a tarifa normal
            sueldo = horasTrabajadas * tarifaHora;
        } else {
            // 40 horas a tarifa normal
            int horasNormales = 40;
            // El resto a tarifa y media
            int horasExtra = horasTrabajadas - 40;

            sueldo = horasNormales * tarifaHora
             + horasExtra * tarifaHora * 1.5;
        }

        return sueldo;
    }
    
    // Método para mostrar los datos del empleado
    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por hora: " + tarifaHora + " euros");
        System.out.println("Sueldo bruto: " + calcularSueldoBruto() + " euros");
        
    }
}
