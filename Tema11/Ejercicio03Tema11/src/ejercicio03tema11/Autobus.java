/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03tema11;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author juan
 */
public class Autobus {

    // Atributos
    private String matricula;
    private Map<String, String> conductores; // DNI -> nombre

    // Constructor por defecto
    public Autobus() {
        matricula = "";
        conductores = new HashMap<>();
    }

    // Constructor completo
    public Autobus(String matricula, Map<String, String> conductores) {
        this.matricula = matricula;
        this.conductores = conductores;
    }

    // Constructor con matricula
    public Autobus(String matricula) {
        this.matricula = matricula;
        conductores = new HashMap<>();
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Map<String, String> getConductores() {
        return conductores;
    }

    public void setConductores(Map<String, String> conductores) {
        this.conductores = conductores;
    }

    // Metodo que añade un conductor (DNI como clave, nombre como valor)
    public void addConductor(String DNI, String nombre) {
        conductores.put(DNI, nombre);
    }

    // Metodo que comprueba si un conductor existe en el autobus
    public boolean tieneConductor(String DNI) {
        return conductores.containsKey(DNI);
    }

    // Metodo que devuelve el numero de conductores
    public int numeroConductores() {
        return conductores.size();
    }

    // Metodo toString para mostrar informacion del autobus
    @Override
    public String toString() {
        String resultado = "Matricula: " + matricula + "\nConductores:\n";

        if (conductores.isEmpty()) {
            resultado += "No hay conductores asignados.";
        } else {
            for (Map.Entry<String, String> entry : conductores.entrySet()) {
                resultado += "DNI: " + entry.getKey()
                        + " - Nombre: " + entry.getValue() + "\n";
            }
        }

        return resultado;
    }
}