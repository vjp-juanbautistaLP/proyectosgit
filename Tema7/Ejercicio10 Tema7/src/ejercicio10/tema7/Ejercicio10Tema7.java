/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10.tema7;

/**
 *
 * @author Juan
 */
public class Ejercicio10Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int [10];//Creamos un array de 10
        rellenarVector(vector);//Lo rellenamos con números aleatorios entre entre 1 y 8
        
        //Mostramos el vector generado
        System.out.println("Se han generado los siguientes números :");
        mostrarVector(vector);
        
        //Sustituimos los valores repetidos por 0
        sustituirRepetidos(vector);
        
        //Mostramos el vector
        System.out.println("Sustituimos los elementos repetidos por un 0:");
        mostrarVector(vector);
    }
    
    //Metodo que rellena el vector con numeros aleatorios del 1 al 8
    public static void rellenarVector(int[]vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random()*8)+1;//Le sumamos uno porque sino seria entre 0 y 7 
        }
    }
    //Metodo que muestra el vector 
    public static void mostrarVector(int[]vector){
        for (int i = 0; i< vector.length; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    //Metodo que sustituye los valores repetidos por 0 
    public static void sustituirRepetidos(int[]vector){
        boolean repetido;
        for(int i = 0; i < vector.length; i++){//El primer for de i toma un numero
            repetido=false;
            for( int j = i +1; j < vector.length; j++){//El for de j compara ese número con los de la derecha
                if (vector[i] == vector[j]){//Si encuentra el mismo numero repetido lo cambia a 0
                    vector[j] = 0;
                    repetido =true;
                    
                }
            }
            if(repetido){
                vector[i]= 0;
                
                        
            }
        }
    }
    
}
