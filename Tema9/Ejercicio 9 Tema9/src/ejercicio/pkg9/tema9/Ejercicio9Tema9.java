/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg9.tema9;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio9Tema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //Le pedimos al usuario que introduzca su nombre y su contraseña
        System.out.println("Introduce nombre de usuario: ");
        String usuario = entrada.nextLine();

        System.out.println("Introduce contrasena: ");
        String contrasena = entrada.nextLine();

        //Llamamos al metodo pasanso usuario y contraseña
        if (validarContrasena(usuario, contrasena)) {
            System.out.println("Contrasena valida.");
        } else {
            System.out.println("Contrasena no valida.");
        }

        entrada.close();//Cerramos el Scanner
    }

    public static boolean validarContrasena(String usuario, String contrasena) {
        //Si la contraseña tiene menos de 6 caracteres no es valida
        if (contrasena.length() < 6) {
            return false;
        }
        //Nos creamos una variable para contar cuantos digitos tiene la contraseña
        int contadorDigitos = 0;
        //Comprobamos que contiene al menos 2 digitso
        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (c >= '0' && c <= '9') {
                contadorDigitos++;
            }
        }
        //Si tiene menos de 2 digitos no es valida
        if (contadorDigitos < 2) {
            return false;
        }
        //Si la contraseña contiene el nombre de usuario convertimos ambos a minuscula para evitar problemas con mayusculas
        if (contrasena.toLowerCase().contains(usuario.toLowerCase())) {
            return false;
        }
        //Si pasa todas las validaciones, la contraseña es válida
        return true;
    }
}
