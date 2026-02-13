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

        //Pedir usuario y contraseña
        System.out.println("Introduce nombre de usuario: ");
        String usuario = entrada.nextLine();

        System.out.println("Introduce contraseña : ");
        String contraseña = entrada.nextLine();

        //Variable para contar dígitos
        int contadorDigitos = 0;

        //Contar cuantos digitos tiene la contraseña
        for (int i = 0; i < contraseña.length(); i++) {
            if (Character.isDigit(contraseña.charAt(i))) {
                contadorDigitos++;
            }
        }
        // Validaciones
        boolean longitudValida = contraseña.length() >= 6;
        boolean digitosValidos = contadorDigitos >= 2;
        boolean usuarioNoIncluido = !contraseña.toLowerCase()
                .contains(usuario.toLowerCase());

        // Comprobar todas las condiciones
        if (longitudValida && digitosValidos && usuarioNoIncluido) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña no válida.");

            if (!longitudValida) {
                System.out.println("- Debe tener al menos 6 caracteres.");
            }

            if (!digitosValidos) {
                System.out.println("- Debe contener al menos 2 dígitos.");
            }

            if (!usuarioNoIncluido) {
                System.out.println("- No puede contener el nombre de usuario.");
            }
        }

        entrada.close();

    }

}
