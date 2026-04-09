/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08tema11;

/**
 *
 * @author juan
 */
public class Sede {
    //Atributos
    private String nombreSede;
    private double ingresos;
    
    //Constructores
    public Sede() {
        nombreSede = "";
        ingresos = 0;
    }

    public Sede(String nombreSede, double ingresos) {
        this.nombreSede = nombreSede;
        this.ingresos = ingresos;
    }
    
    //Getters/Setters
    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Nombre de la sede: " + nombreSede + "\nIngresos: " + ingresos;
    }
}