/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17.tema7;

/**
 *
 * @author Juan
 */
public class Ejercicio17Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el array y llamamos al metodo crearArray
        int[] numeros = crearArray();
        
        //Mostramos el array original
        System.out.println("Array origianl:");
        mostrarArray(numeros);
        
        //Ordenamos el array de mayor a menor
        ordernarMayorMenor(numeros);
        
        //Mostrar el array ordenado
        System.out.println("Array ordenado de mayor a menor");
        mostrarArray(numeros);
    }
    
    //Metodo que crea un array de 10 números aleatorios entre 0 y 9
    public static int[] crearArray(){
        int[] array = new int[10]; //Array de 10 posiciones de 0 a 9
        
        //Rellenamos el array con números aleatorios
        for ( int i = 0; i < array.length ; i++){
            array[i] = (int)(Math.random() * 10); //0 a 9
        }
        
        return array; //Devolvemos el array creado
    }
    
    //Metodo quye muestra el array
    public static void mostrarArray(int[] array){
        //Recorremos el array y mostramos cada elemento
        for(int i = 0; i < array.length ; i++){
            System.out.print(array[i] + "");
        }
        System.out.println();
    }
    
    
    //Metodo que ordena el array de mayor a menor (burbuja)
    public static void ordernarMayorMenor(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {// -1 porque con 9 pasadas sobra
            for (int j = 0; j < array.length - 1 - i; j++) {//-i es para no revisar lo que ya esta ordenador al final
                if (array[j] < array[j + 1]) {//El numero más grande se va moviendo a la izquierda
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    //Guardamos el primero en el aux, ponemos el segundo en el primero y ponemos el aux en el segundo
                }
            }
        }
    }
    
}
