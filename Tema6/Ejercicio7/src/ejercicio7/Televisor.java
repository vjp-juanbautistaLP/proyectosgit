/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Juan
 */
public class Televisor implements ControlRemoto{
    //Atributos
    private boolean encendido;
    private int canal;
    private int volumen;
    
    //Constructor por defecto
    public Televisor(){
        encendido = false;
        canal = 1;
        volumen = 10;
    }
    //Constructor parametrizado

    public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }
    
    //Getters de canal y volumen
    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }
    //Setters de canal y volumen

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    // Método para mostrar estado actual
    public void mostrarEstado() {
        System.out.println("Encendido: " + encendido);
        System.out.println("Canal actual: " + canal);
        System.out.println("Volumen actual: " + volumen);
    }
    
    //Interfaces
     @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Televisor encendido. Canal actual: " + canal);
        }
    }
    @Override
    public void apagar() {
        if (encendido) {
            System.out.println("La TV se apagará en 10s");
            encendido = false;
        }
    }
    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen--;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen++;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = (int) canal;
            System.out.println("Canal actual: " + this.canal);
        }
    }
    
    //Mostrar 
    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
    
}
