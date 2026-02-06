/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11y12;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio11Y12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Ejercicio11
        //Mueble con costructor por defectp
        Mueble mueble1 = new Mueble();
        mueble1.setDescripcion("Mesa de madera");
        mueble1.setPrecio(120);

        //Mueble con constructor parametrizado
        Mueble mueble2 = new Mueble(300, "Sofa de 5 plazas");

        //Mostramos la informacion
        System.out.println(mueble1);
        System.out.println(mueble2);

        //Cambiar descripcion usando setter
        mueble2.setDescripcion("Sofa de piel");

        System.out.println("\nDespues de modificar");
        System.out.println(mueble2);

        
        //Ejercicio 12
        Scanner entrada = new Scanner(System.in);
        //Creamos un vector de 4 muebles
        //Y al inicio de todas las posiciones están a null
        Mueble[] muebles = new Mueble[4];
        int opcion;//Variable para guardar la opción elegida
        
        //Bucle do-while para mostrar el menú
        do {
            System.out.println("\n--- MENÚ MUEBLES ---");
            System.out.println("1. Rellenar muebles (los 4)");
            System.out.println("2. Mostrar muebles");
            System.out.println("3. Mostrar muebles por precio (<=)");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();//Leemos la opción del usuario
            entrada.nextLine(); // limpiar buffer
            
            
            switch (opcion) {
                case 1:
                    // Rellenar todos los muebles del vector
                    for (int i = 0; i < muebles.length; i++) {
                        System.out.println("\nMUEBLE " + (i + 1));
                        //Pedimos la descripcion del mueble
                        System.out.print("Descripción: ");
                        String descripcion = entrada.nextLine();
                        //Pedimos el precio del mueble
                        System.out.print("Precio: ");
                        double precio = entrada.nextDouble();
                        entrada.nextLine(); // limpiar buffer
                        //Creamos un nuevo objeto Mueble y lo guardamos en el array
                        muebles[i] = new Mueble(precio, descripcion);
                    }
                    System.out.println("\nMUEBLES RELLENADOS CON EXITO.");
                    break;

                case 2:
                    // Mostrar muebles
                    System.out.println("\n--- LISTA DE MUEBLES ---");
                    boolean hayMuebles = false;
                    
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null) {//Comprobamos si la posicion contiene un mueble
                            System.out.println("Posición " + (i + 1) + ": " + muebles[i]);
                            hayMuebles = true;
                        } else {
                            System.out.println("Posición " + (i + 1) + ": (vacío)");
                        }
                    }

                    if (!hayMuebles) {
                        System.out.println("No hay muebles rellenos todavía. Usa la opción 1.");
                    }
                    break;

                case 3:
                    // Mostrar muebles por precio (<=)
                    System.out.print("Introduce el precio máximo: ");
                    double precioMax = entrada.nextDouble();
                    entrada.nextLine(); // limpiar buffer

                    System.out.println("\n--- MUEBLES CON PRECIO <= " + precioMax + " € ---");

                    boolean encontrado = false;
                    //Recorremos el array para buscar muebles que cumplan la condicion de precio
                    for (Mueble m : muebles) {
                        //Comprobamos que el objeto no sea null y que cumpla con la condicion
                        if (m != null && m.getPrecio() <= precioMax) {
                            System.out.println(m);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No hay muebles que cumplan esa condición (o no has rellenado el vector).");
                    }
                    break;

                case 0:
                    //Salir del programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    //Si el usuario introduce una opción no valida
                    System.out.println("Opcion no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 0);//El menú se repite hasta que el usuario elija salir

        entrada.close();
    }

}


