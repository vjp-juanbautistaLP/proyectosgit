/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08tema11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Ejercicio08Tema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lista donde se guardan todas las ciudades
        ArrayList<Ciudad> ciudades = new ArrayList<>();

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 ->
                    aniadirCiudad(ciudades);
                case 2 ->
                    mostrarCiudades(ciudades);
                case 3 ->
                    mostrarSedesSuperioresMedia(ciudades);
                case 4 ->
                    buscarSede(ciudades);
                case 5 ->
                    aniadirSede(ciudades);
                case 6 ->
                    mostrarTodasLasSedesOrdenadas(ciudades);
                case 7 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opcion no valida, intentelo de nuevo");
            }
        } while (opcion != 7);
    }

    // Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. Aniadir ciudad");
        System.out.println("2. Mostrar ciudades con sus sedes");
        System.out.println("3. Mostrar sedes con ingresos superiores a la media");
        System.out.println("4. Buscar sede por nombre");
        System.out.println("5. Aniadir sede a una ciudad");
        System.out.println("6. Mostrar todas las sedes ordenadas por ingresos");
        System.out.println("7. Salir del programa");
        System.out.print("Introduce una opcion: ");
    }

    // Metodo que añade una nueva ciudad y una o varias sedes
    public static void aniadirCiudad(ArrayList<Ciudad> ciudades) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la ciudad: ");
        String nombreCiudad = entrada.nextLine();
        Ciudad ciudad = new Ciudad(nombreCiudad);

        String continuar;
        do {
            ciudad.aniadirSede();
            System.out.print("Aniadir otra sede - Si/No: ");
            continuar = entrada.nextLine();
        } while (continuar.equalsIgnoreCase("si"));

        ciudades.add(ciudad);
    }

    // Metodo que muestra las ciudades con sus sedes
    public static void mostrarCiudades(ArrayList<Ciudad> ciudades) {
        System.out.println();

        if (ciudades.isEmpty()) {
            System.out.println("No hay ciudades registradas");
        } else {
            for (Ciudad ciudad : ciudades) {
                System.out.println("Ciudad: " + ciudad.getNombre());
                ciudad.mostrarSedes();
            }
        }
    }

    // Metodo que muestra las sedes con ingresos superiores a la media global
    public static void mostrarSedesSuperioresMedia(ArrayList<Ciudad> ciudades) {
        System.out.println();

        double total = 0;
        int contador = 0;

        // Calcular total y numero de sedes
        for (Ciudad ciudad : ciudades) {
            for (Sede sede : ciudad.getSedes()) {
                total += sede.getIngresos();
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No hay sedes registradas");
            return;
        }

        double media = total / contador;
        System.out.println("La media global de ingresos es: " + media);

        boolean alguna = false;

        for (Ciudad ciudad : ciudades) {
            for (Sede sede : ciudad.getSedes()) {
                if (sede.getIngresos() > media) {
                    System.out.println(sede.getNombreSede() + " - " + sede.getIngresos()
                            + " - Ciudad: " + ciudad.getNombre());
                    alguna = true;
                }
            }
        }

        if (!alguna) {
            System.out.println("Ninguna sede supera la media");
        }
    }

    // Metodo que busca una sede por nombre en todas las ciudades
    public static void buscarSede(ArrayList<Ciudad> ciudades) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la sede a buscar: ");
        String nombreSede = entrada.nextLine();

        boolean encontrado = false;

        for (Ciudad ciudad : ciudades) {
            if (ciudad.buscarSede(nombreSede)) {
                for (Sede sede : ciudad.getSedes()) {
                    if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                        System.out.println("La sede \"" + nombreSede + "\" con ingresos " + sede.getIngresos()
                                + " esta en " + ciudad.getNombre());
                        encontrado = true;
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("La sede no existe");
        }
    }

    // Metodo que añade una sede a una ciudad ya creada
    public static void aniadirSede(ArrayList<Ciudad> ciudades) {
        System.out.println();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre de la ciudad donde aniadir la sede: ");
        String nombreCiudad = entrada.nextLine();

        Ciudad encontrada = null;
        boolean encontrado = false;
        Iterator<Ciudad> it = ciudades.iterator();

        while (it.hasNext() && !encontrado) {
            Ciudad ciudad = it.next();
            if (ciudad.getNombre().equalsIgnoreCase(nombreCiudad)) {
                encontrada = ciudad;
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe esa ciudad");
        } else {
            encontrada.aniadirSede();
        }
    }

    // Metodo que muestra todas las sedes ordenadas de mayor a menor ingresos
    public static void mostrarTodasLasSedesOrdenadas(ArrayList<Ciudad> ciudades) {
        System.out.println("\n--TODAS LAS SEDES ORDENADAS--");

        ArrayList<Sede> sedes = new ArrayList<>();

        // Meter todas las sedes en una lista
        for (Ciudad ciudad : ciudades) {
            sedes.addAll(ciudad.getSedes());
        }

        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
            return;
        }

        // Ordenacion por insercion
        for (int i = 1; i < sedes.size(); i++) {
            Sede actual = sedes.get(i);
            int j = i - 1;

            while (j >= 0 && sedes.get(j).getIngresos() < actual.getIngresos()) {
                sedes.set(j + 1, sedes.get(j));
                j--;
            }

            sedes.set(j + 1, actual);
        }

        for (Sede sede : sedes) {
            System.out.println(sede);
        }
    }
}
