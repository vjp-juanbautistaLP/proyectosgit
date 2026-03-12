/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5.tema10;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ejercicio5Tema10 {

    // Método que pide números al usuario y los guarda en una lista
    public static ArrayList<Integer> rellenarLista() {
        
        
        Scanner entrada = new Scanner(System.in);
        
        // Creamos una lista dinámica para almacenar los números
        ArrayList<Integer> lista = new ArrayList<>();
        
        // Variable donde se guardará cada número introducido
        int numero;

        // Mensaje para el usuario
        System.out.println("Introduce números (negativo para terminar):");

        // Leemos el primer número antes del bucle
        numero = entrada.nextInt();

        // Mientras el número sea mayor o igual que 0
        while (numero >= 0) {
            
            // Añadimos el número a la lista
            lista.add(numero);
            
            // Leemos el siguiente número
            numero = entrada.nextInt();
        }

        // Devolvemos la lista con los números introducidos
        return lista;
    }

    
    // Método que muestra por pantalla todos los elementos de la lista
    public static void mostrarLista(ArrayList<Integer> lista) {
        
        // Recorremos la lista con un for-each
        for (int num : lista) {
            
            // Imprimimos cada número seguido de un espacio
            System.out.print(num + " ");
        }
        
        // Salto de línea final
        System.out.println();
    }

    
    // Método que devuelve el mayor número par de la lista
    public static int mayorPar(ArrayList<Integer> lista) {
        
        // Inicializamos la variable mayor con el valor mínimo posible
        // Esto garantiza que cualquier número par será mayor
        int mayor = Integer.MIN_VALUE;

        // Recorremos la lista
        for (int num : lista) {
            
            // Comprobamos dos cosas:
            // 1- Que el número sea par (num % 2 == 0)
            // 2- Que sea mayor que el actual valor de "mayor"
            if (num % 2 == 0 && num > mayor) {
                
                // Si cumple ambas condiciones, actualizamos el mayor
                mayor = num;
            }
        }

        // Devolvemos el mayor número par encontrado
        // Si no hay pares, devolverá Integer.MIN_VALUE
        return mayor;
    }
}