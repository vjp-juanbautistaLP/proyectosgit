/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Juan
 */
public class Radio implements ControlRemoto{
    //Atributos
    private boolean encendido;
    private float emisora;
    private int volumen;
    
    //Constructor por defecto
    public Radio(){
        encendido = false;
        emisora = 80.0f;
        volumen = 15;
    }
    //Constructor parametrizado

    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }
    //Getters de emisor y volumen

    public float getEmisora() {
        return emisora;
    }

    public int getVolumen() {
        return volumen;
    }
    
    //Setters de emisora y volumen

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    
   
    // Método para mostrar estado actual
    public void mostrarEstado() {
        System.out.println("Encendido: " + encendido);
        System.out.println("Emisora actual: " + emisora);
        System.out.println("Volumen actual: " + volumen);
    }
    
    //Interfaces 
    
    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("Radio encendida.");
        }
    }   
    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("Radio apagada.");
        }
    }
    @Override
    public void bajarVolumen() {
        if (encendido) {
            volumen -= 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void subirVolumen() {
        if (encendido) {
            volumen += 5;
            System.out.println("Volumen actual: " + volumen);
        }
    }
    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.emisora = canal;
            System.out.println("Emisora actual: " + this.emisora);
        }
    }
    
    //Mostrar
    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", emisora=" + emisora + ", volumen=" + volumen + '}';
    }
    
   
}
