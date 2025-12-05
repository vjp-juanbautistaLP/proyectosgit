/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author Juan
 */

public class Test {
    public static void main(String[] args) {
        // Televisor
        Televisor tv = new Televisor();
        tv.encender();
        System.out.println("Canal: " + tv.getCanal() + ", Volumen: " + tv.getVolumen());

        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        System.out.println("Volumen después de subir 3 veces: " + tv.getVolumen());

        tv.cambiarCanal(5);
        tv.bajarVolumen();
        tv.apagar();
        System.out.println("Canal: " + tv.getCanal() + ", Volumen: " + tv.getVolumen());

        System.out.println("\n----------------------\n");

        // Radio
        Radio radio = new Radio();
        radio.encender();
        System.out.println("Emisora: " + radio.getEmisora() + ", Volumen: " + radio.getVolumen());

        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        System.out.println("Volumen después de subir 3 veces: " + radio.getVolumen());

        radio.cambiarCanal(95.5f);
        radio.bajarVolumen();
        radio.apagar();
        System.out.println("Emisora: " + radio.getEmisora() + ", Volumen: " + radio.getVolumen());
    }
}
