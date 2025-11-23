/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Alumno 1
        System.out.print("Introduce el nombre del alumno 1: ");
        String nombre1 = entrada.nextLine();
        int nota1 = pedirNota(entrada);
        Alumno alumno1 = new Alumno(nombre1, nota1);

        // Alumno 2
        System.out.print("Introduce el nombre del alumno 2: ");
        String nombre2 = entrada.nextLine();
        int nota2 = pedirNota(entrada);
        Alumno alumno2 = new Alumno(nombre2, nota2);

        // Alumno 3
        System.out.print("Introduce el nombre del alumno 3: ");
        String nombre3 = entrada.nextLine();
        int nota3 = pedirNota(entrada);
        Alumno alumno3 = new Alumno(nombre3, nota3);

        // Mostrar resultados
        System.out.println("\nResultados:");
        alumno1.mostrarInformacion();
        alumno2.mostrarInformacion();
        alumno3.mostrarInformacion();

        entrada.close();
    }
        
    // Método auxiliar para validar la nota
    private static int pedirNota(Scanner entrada) {
        int nota;
        while (true) {
            System.out.print("Introduce la nota (0-10): ");
            nota = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            if (nota >= 0 && nota <= 10) {
                return nota;
            } else {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
            }
        }
    }


}
