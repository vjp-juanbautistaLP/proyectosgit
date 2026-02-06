/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13y14;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ejercicio13Y14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Ejercicio13
        System.out.println("Ejercicio 13\n");

        //Creamos un alumno con constructor por defecto y usamos setters
        Alumno a1 = new Alumno();
        a1.setNombre("Pepe");
        a1.setEdad(18);
        a1.setNotaMedia(6.5);

        //Creamos otro alumno con constructor parametrizado
        Alumno a2 = new Alumno("María", 19, 8.2);

        //Mostramos informacion
        System.out.println(a1);
        System.out.println(a2);

        //Modificar algo "a mi gusto"
        a2.setNotaMedia(9.0);
        System.out.println("\nDespués de modificar la nota de María:");
        System.out.println(a2);

        //Ejercicio14
        System.out.println("\nEjercicio 14 ");
        //Creamos un array de 5 alumnos
        Alumno[] alumnos = new Alumno[5];
        int opcion;//Guardamos la opcion elegida

        do {
            System.out.println("\n--- MENU ALUMNOS ---");
            System.out.println("1. Rellenar un alumno (elegir posición)");
            System.out.println("2. Mostrar vector de alumnos");
            System.out.println("3. Mostrar alumnos con nota media por encima de una nota");
            System.out.println("4. Mostrar cuántos alumnos tienen la nota media suspensa");
            System.out.println("5. Buscar alumno por nombre");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();//Leemos la opcion
            entrada.nextLine(); // limpiar buffer
            
            switch (opcion) {

                case 1: {
                    // Rellenar un alumno en una posición
                    int pos;
                    
                    // Pedimos posición hasta que sea válida y esté libre
                    while (true) {
                        System.out.print("Introduce posición (1 a 5): ");
                        pos = entrada.nextInt();
                        entrada.nextLine();//limpiar buffer
                        
                        //Comprobamos si la posicion está fuera del rango
                        if (pos < 1 || pos > 5) {
                            System.out.println("Posición inválida. Debe ser de 1 a 5.");
                        //Comprobamos si esa posicion ya tiene un alumno guardado
                        } else if (alumnos[pos - 1] != null) {
                            System.out.println("Esa posición ya está ocupada. Elige otra.");
                        //Si esta todo bien , salimos del bucle
                        } else {
                            break;
                        }
                    }
                    
                    //Pedimos los datos del alumno
                    System.out.print("Nombre: ");
                    String nombre = entrada.nextLine();
                    
                    System.out.print("Edad: ");
                    int edad = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nota media: ");
                    double nota = entrada.nextDouble();
                    entrada.nextLine();
                    //Cremamos el alumno y lo guardamos en la posición elegida
                    alumnos[pos - 1] = new Alumno(nombre, edad, nota);
                    //Confirmacion
                    System.out.println("Alumno guardado en la posición " + pos + " con éxito.");
                    break;
                }

                case 2:
                    // Mostrar vector (solo celdas rellenas)
                    System.out.println("\n--- ALUMNOS MATRICULADOS ---");
                    boolean hay = false;//Para saber si hay al menos un alumno
                    //Recorremos el array completo
                    for (Alumno al : alumnos) {
                        if (al != null) {
                            System.out.println(al);
                            hay = true;
                        }
                    }
                    //Si no hay ninguno
                    if (!hay) {
                        System.out.println("No hay alumnos guardados todavía.");
                    }
                    break;

                case 3:
                    // Mostrar alumnos con nota por encima de X
                    System.out.print("Introduce la nota mínima: ");
                    double notaMin = entrada.nextDouble();
                    entrada.nextLine();

                    System.out.println("\n--- ALUMNOS CON NOTA > " + notaMin + " ---");
                    boolean encontrado = false;//para saber si algún alumno cimple
                    
                    //Recorremos el array
                    for (Alumno al : alumnos) {
                        if (al != null && al.getNotaMedia() > notaMin) {
                            System.out.println(al);
                            encontrado = true;
                        }
                    }
                    //Si no hya ninguno , lo indicamos
                    if (!encontrado) {
                        System.out.println("No hay alumnos con nota por encima de esa nota.");
                    }
                    break;

                case 4:
                    // Contar alumnos suspensos (nota < 5)
                    int suspensos = 0;
                    //Recorremos el array y contamos los alumnos con nota < 5
                    for (Alumno al : alumnos) {
                        if (al != null && al.getNotaMedia() < 5) {
                            suspensos++;
                        }
                    }
                    //Mostramos el resultado
                    System.out.println("Hay " + suspensos + " alumno(s) con la nota media suspensa.");
                    break;

                case 5:
                    // Buscar alumno por nombre
                    System.out.print("Introduce el nombre a buscar: ");
                    String nombreBuscar = entrada.nextLine();

                    boolean esta = false;//indica si se ha encontrado
                    //Recorremos el array buscando coincidencia de nombre
                    for (Alumno al : alumnos) {
                        if (al != null && al.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Sí está matriculado: " + al);
                            esta = true;
                            break;
                        }
                    }
                    //Si no se encuentra
                    if (!esta) {
                        System.out.println("No está matriculado.");
                    }
                    break;
                    //Salir
                case 0:
                    System.out.println("Saliendo...");
                    break;
                    
                    //No valido si pone algo que no se muestra en el menu
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);//El programa termina cuando opcion sea 0

        entrada.close();
    }
}
