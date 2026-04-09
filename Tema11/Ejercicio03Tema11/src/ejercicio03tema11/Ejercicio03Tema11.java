/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03tema11;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Ejercicio03Tema11 {

    // Scanner global para no crear muchos objetos Scanner
    static Scanner entrada = new Scanner(System.in);
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Vector de 6 dársenas donde se almacenan los autobuses
        Autobus[] darsenas = new Autobus[6];

        int opcion;

        // Bucle del menú
        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 ->
                    aparcarBus(darsenas);
                case 2 ->
                    mostrarDarsenasLibres(darsenas);
                case 3 ->
                    buscarAutobus(darsenas);
                case 4 ->
                    buscarConductor(darsenas);
                case 5 ->
                    busConMasConductores(darsenas);
                case 6 ->
                    System.out.println("Saliendo del programa...");
                default ->
                    System.out.println("Opcion no valida, intentalo de nuevo");
            }

        } while (opcion != 6);
    }

    // Metodo que muestra el menu por pantalla
    public static void mostrarMenu() {
        System.out.println("\n--MENU--");
        System.out.println("1. APARCAR AUTOBUS");
        System.out.println("2. MOSTRAR DARSENAS LIBRES");
        System.out.println("3. BUSCAR AUTOBUS POR MATRICULA");
        System.out.println("4. BUSCAR CONDUCTOR");
        System.out.println("5. AUTOBUS CON MAS CONDUCTORES");
        System.out.println("6. SALIR DEL PROGRAMA");
        System.out.print("INTRODUCE UNA OPCION: ");
    }

    // Metodo que permite aparcar un autobus en una darsena libre
    public static void aparcarBus(Autobus[] darsenas) {

        int pos;

        // Se pide la posicion hasta que sea valida y esté libre
        do {
            System.out.print("Introduce la posicion para aparcar el bus (0-5): ");
            pos = entrada.nextInt();
            entrada.nextLine();

            if (pos < 0 || pos > 5) {
                System.out.println("Posicion no valida.");
            } else if (darsenas[pos] != null) {
                System.out.println("La darsena esta ocupada, elige otra.");
            }

        } while (pos < 0 || pos > 5 || darsenas[pos] != null);

        // Se crea el autobus con su matricula
        Autobus bus = new Autobus(pedirMatricula());

        // Se pide el numero de conductores
        System.out.print("Cuantos conductores quieres aniadir: ");
        int num = entrada.nextInt();
        entrada.nextLine();

        // Se añaden los conductores al HashMap del autobus
        for (int i = 0; i < num; i++) {
            bus.addConductor(pedirDni(), pedirNombre());
        }

        // Se guarda el autobus en la darsena elegida
        darsenas[pos] = bus;

        System.out.println("Autobus aparcado correctamente en la darsena " + pos);
    }

    // Metodo que muestra las darsenas que estan libres
    public static void mostrarDarsenasLibres(Autobus[] darsenas) {

        boolean libre = false;

        // Recorremos el vector buscando posiciones vacias
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println("Darsena " + i + " libre");
                libre = true;
            }
        }

        // Si no hay ninguna libre se informa al usuario
        if (!libre) {
            System.out.println("No hay darsenas libres");
        }
    }

    // Metodo que busca un autobus por su matricula
    public static void buscarAutobus(Autobus[] darsenas) {

        System.out.print("Introduce la matricula a buscar: ");
        String matricula = entrada.nextLine();

        boolean encontrado = false;
        int i = 0;

        // Se recorre el vector hasta encontrar el autobus
        while (i < darsenas.length && !encontrado) {

            if (darsenas[i] != null
                    && darsenas[i].getMatricula().equalsIgnoreCase(matricula)) {

                System.out.println("Autobus encontrado en darsena: " + i);
                System.out.println(darsenas[i]); // usa toString()
                encontrado = true;

            } else {
                i++;
            }
        }

        // Si no se encuentra, se informa
        if (!encontrado) {
            System.out.println("No se encontro ningun autobus con esa matricula");
        }
    }

    // Metodo que busca un conductor por su DNI
    public static void buscarConductor(Autobus[] darsenas) {

        System.out.print("Introduce el DNI del conductor: ");
        String DNI = entrada.nextLine();

        boolean encontrado = false;
        int i = 0;

        // Se recorre cada autobus buscando el DNI en su HashMap
        while (i < darsenas.length && !encontrado) {

            if (darsenas[i] != null
                    && darsenas[i].getConductores().containsKey(DNI)) {

                System.out.println("El conductor trabaja en el autobus con matricula: "
                        + darsenas[i].getMatricula());
                encontrado = true;

            } else {
                i++;
            }
        }

        // Si no se encuentra el conductor
        if (!encontrado) {
            System.out.println("No se encontro ningun conductor con ese DNI");
        }
    }

    // Metodo que devuelve la posicion del autobus con mas conductores
    public static void busConMasConductores(Autobus[] darsenas) {

        int max = -1;
        int posicion = -1;

        // Se recorre el vector comparando el numero de conductores
        for (int i = 0; i < darsenas.length; i++) {

            if (darsenas[i] != null) {

                int cantidad = darsenas[i].getConductores().size();

                if (cantidad > max) {
                    max = cantidad;
                    posicion = i;
                }
            }
        }

        // Si no hay autobuses
        if (posicion == -1) {
            System.out.println("No hay autobuses aparcados");
        } else {
            System.out.println("El autobus con mas conductores esta en la darsena " + posicion);
            System.out.println("Matricula: " + darsenas[posicion].getMatricula());
            System.out.println("Numero de conductores: " + max);
        }
    }

    // Metodo que pide la matricula al usuario
    public static String pedirMatricula() {
        System.out.print("Introduce la matricula del autobus: ");
        return entrada.nextLine();
    }

    // Metodo que pide el DNI
    public static String pedirDni() {
        System.out.print("DNI del conductor: ");
        return entrada.nextLine();
    }

    // Metodo que pide el nombre
    public static String pedirNombre() {
        System.out.print("Nombre del conductor: ");
        return entrada.nextLine();
    }
}


    