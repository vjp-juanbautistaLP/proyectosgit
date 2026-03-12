/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Ejercicio14Tema10 {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Alumno> alumnos = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("----MENU----");
            System.out.println("1.Introducir alumno");
            System.out.println("2.Mostrar alumnos");
            System.out.println("3.Mejor alumno");
            System.out.println("4.Asignatura más dificil");
            System.out.println("5.Salir");
            System.out.println("Elige una opcion");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    insertarAlumno();
                    break;

                case 2:
                    mostrarAlumnos();
                    break;

                case 3:
                    mejorAlumno();
                    break;

                case 4:
                    asignaturaMasDificil();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción incorrecta. Elige entre 1 y 5.");
            }
        } while (opcion != 5);
    }

    public static void insertarAlumno() {
        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();

        System.out.print("Nota Lengua: ");
        float lengua = entrada.nextFloat();

        System.out.print("Nota Mates: ");
        float mates = entrada.nextFloat();

        System.out.print("Nota Física: ");
        float fisica = entrada.nextFloat();

        entrada.nextLine(); // limpiar buffer

        Asignatura[] asignaturas = new Asignatura[3];
        asignaturas[0] = new Asignatura("Lengua", lengua);
        asignaturas[1] = new Asignatura("Mates", mates);
        asignaturas[2] = new Asignatura("Fisica", fisica);

        Alumno a = new Alumno(nombre, asignaturas);
        alumnos.add(a);

        System.out.println("Alumno añadido correctamente.");
    }

    public static void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos introducidos.");
            return;
        }

        for (Alumno a : alumnos) {
            System.out.println("\nAlumno: " + a.getNombre());

            for (Asignatura as : a.getAsignaturas()) {
                System.out.println(as.getNombre() + ": " + as.getNota());
            }

            System.out.println("Media: " + a.calcularMedia());
        }
    }

    public static void mejorAlumno() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos para calcular el mejor.");
            return;
        }

        Alumno mejor = alumnos.get(0);
        float mejorMedia = mejor.calcularMedia();

        for (Alumno a : alumnos) {
            float media = a.calcularMedia();
            if (media > mejorMedia) {
                mejorMedia = media;
                mejor = a;
            }
        }

        System.out.println("Mejor alumno: " + mejor.getNombre() + " con media " + mejorMedia);
    }

    public static void asignaturaMasDificil() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos para calcular suspensos.");
            return;
        }

        int suspLengua = 0, suspMates = 0, suspFisica = 0;

        for (Alumno a : alumnos) {
            Asignatura[] as = a.getAsignaturas();

            if (as[0].getNota() < 5) {
                suspLengua++;
            }
            if (as[1].getNota() < 5) {
                suspMates++;
            }
            if (as[2].getNota() < 5) {
                suspFisica++;
            }
        }

        int max = Math.max(suspLengua, Math.max(suspMates, suspFisica));

        if (max == suspLengua) {
            System.out.println("Asignatura más difícil: Lengua (" + suspLengua + " suspensos)");
        } else if (max == suspMates) {
            System.out.println("Asignatura más difícil: Mates (" + suspMates + " suspensos)");
        } else {
            System.out.println("Asignatura más difícil: Física (" + suspFisica + " suspensos)");
        }
    }
}
