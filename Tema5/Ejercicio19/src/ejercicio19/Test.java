/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Test {
      public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Vamos a guardar 3 empleados
        Empleado e1, e2, e3;

        System.out.println("Empleado 1");
        System.out.println("Nombre: ");
        String nombre1 = entrada.nextLine();
        System.out.print("Horas trabajadas: ");
        int horas1 = entrada.nextInt();
        
        System.out.print("Tarifa por hora (euros): ");
        double tarifa1 = entrada.nextDouble();
        entrada.nextLine(); // limpiar salto de línea
        e1 = new Empleado(nombre1, horas1, tarifa1);

        
        System.out.println("Empleado 2");
        System.out.print("Nombre: ");
        String nombre2 = entrada.nextLine();
        
        System.out.print("Horas trabajadas: ");
        int horas2 = entrada.nextInt();
        
        System.out.print("Tarifa por hora (euros): ");
        double tarifa2 = entrada.nextDouble();
        entrada.nextLine();
        e2 = new Empleado(nombre2, horas2, tarifa2);

        
        System.out.println("Empleado 3");
        System.out.print("Nombre: ");
        String nombre3 = entrada.nextLine();
        
        System.out.print("Horas trabajadas: ");
        int horas3 = entrada.nextInt();
        
        System.out.print("Tarifa por hora (euros): ");
        double tarifa3 = entrada.nextDouble();
        e3 = new Empleado(nombre3, horas3, tarifa3);

        
        System.out.println("Sueldos brutos");
        e1.mostrarDatos();
        e2.mostrarDatos();
        e3.mostrarDatos();

        entrada.close();
    }  
}
