/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06tema11;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Ejercicio06Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Se crea una campaña que gestiona todas las donaciones
        Campania camp = new Campania();

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> camp.aniadirDonacion();
                case 2 -> camp.mostrarDonaciones();
                case 3 -> camp.buscarPorNombre();
                case 4 -> System.out.print("\nNumero de donaciones: " + camp.numeroDonaciones() + "\n");
                case 5 -> System.out.print("\nTotal recaudado: " + camp.totalRecaudado() + " Euros" + "\n");
                case 6 -> camp.ordenarDonaciones();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 7);
    }

    //Metodo que muestra por pantalla el menu
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Anadir donacion");
        System.out.println("2. Mostrar donaciones");
        System.out.println("3. Buscar por nombre");
        System.out.println("4. Numero de donaciones");
        System.out.println("5. Total recaudado");
        System.out.println("6. Ordenar donaciones");
        System.out.println("7. Salir del programa");
        System.out.print("Elige una opcion: ");
    }
}