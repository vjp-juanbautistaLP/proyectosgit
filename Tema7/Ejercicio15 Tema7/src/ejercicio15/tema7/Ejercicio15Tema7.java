/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15.tema7;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class Ejercicio15Tema7 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();//Genero ventas aleatorias 
        
        int[] ventas = new int[12];//Creo el array de 12 
        String[] meses = {//Creo otro array de los meses
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        int opcion;
        
        do {
            //Muestro el menú
            System.out.println("Menu de Acciones");
            System.out.println("1. Rellenar vector con ventas");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al reves");
            System.out.println("4. Mostrar suma total de ventas");
            System.out.println("5. Mostrar ventas de los meses pares");
            System.out.println("6. Mostrar el mes con mas ventas");
            System.out.println("7. Salir del menu de acciones");
            //Opcion del usuario
            opcion = entrada.nextInt();
           
            switch (opcion) {
                case 1:
                    //Mostrar ventas en orden(Enero a Diciembre)
                    for (int i = 0; i < ventas.length; i++) {
                        ventas[i] = random.nextInt(91) + 10;
                    }
                    System.out.println("Ventas generadas correctamente");
                    break;

                case 2:
                    //Mostrar ventas en orden (Enero a Diciembre)
                    System.out.println("Ventas mensuales");
                    for (int i = 0; i < ventas.length; i++) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                    }
                    break;
                case 3:
                    //Mostrar ventas al revés(Diciembre a Enero)
                    System.out.println("Ventas al reves");
                    for (int i = ventas.length - 1; i >= 0; i--) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                    }
                    break;
                case 4:
                    //Sumar todas las ventas del año
                    int suma = 0;
                    for (int v : ventas) {
                        suma += v;
                    }
                    System.out.println("Suma total de ventas del año: " + suma);
                    break;
                case 5:
                    //Mostrar ventas de los meses pares
                    //Como el array empieza en 0 , Febrereo es 1 ,Marzo es 2 , Abril es 3
                    System.out.println("Ventas de los mese pares");
                    for (int i = 1; i < ventas.length; i += 2) {
                        System.out.println(meses[i] + ": " + ventas[i]);
                    }
                    break;
                case 6:
                    //Buscar el mes con más ventas
                    int max = ventas[0];
                    int indiceMax = 0;
                    //Recorremos desde Febrero y lo comparamos
                    for (int i = 1; i < ventas.length; i++) {
                        if (ventas[i] > max) {
                            max = ventas[i];
                            indiceMax = i;
                        }
                    }
                    System.out.println("\n El mes con mas ventas es " + meses[indiceMax] + " con " + max + " ventas");
                    break;
                case 7:
                    //Salir
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    //Si el usuario escribe un numero que no esta entre el 1 y 7
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 7); //Condiciones para repetir el menu
    }
}