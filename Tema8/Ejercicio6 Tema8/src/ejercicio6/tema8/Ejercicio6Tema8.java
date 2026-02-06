/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6.tema8;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ejercicio6Tema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         //Cuantos empleados se van a introducir
        System.out.print("¿Cuántos empleados desea introducir? ");
        int numEmpleados = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer
        //Creamos array de empleados con el tamaño indicado
        Empleado[] empleados = new Empleado[numEmpleados];
        //Hacemos un bucle para introducir los datos de cada empleado
        for (int i = 0; i < numEmpleados; i++) {

            System.out.println("\n- EMPLEADO " + (i + 1) + " -");
            
            empleados[i] = new Empleado(); // Se crea el emplead con el constructor por defecto
            
            //Se pide y asigna el nombre
            System.out.print("Introduzca el nombre del empleado: ");
            empleados[i].setNombre(entrada.nextLine());
            //Se pide y asigna las horas trabajads
            System.out.print("¿Cuántas horas trabajó este mes? ");
            empleados[i].setHorasTrabajadas(entrada.nextInt());
            
            //Se pide y asigna la tarifa por hora
            System.out.print("¿Cuál es su tarifa por hora de trabajo? ");
            empleados[i].setTarifaHora(entrada.nextDouble());
            entrada.nextLine(); // limpiar buffer
            
            //Mensaje de confirmación
            System.out.println("EMPLEADO " + (i + 1) + " ALMACENADO CON ÉXITO");
        }
        //Mostramos los sueldos de todos los empleados 
        System.out.println("\nSUELDO BRUTO DE LOS EMPLEADOS\n");
        //
        for (Empleado e : empleados) {//Recorre el array y muestra cada empleado
            System.out.println(e); // llama automáticamente a toString()
        }

        entrada.close();
    }
    
}
