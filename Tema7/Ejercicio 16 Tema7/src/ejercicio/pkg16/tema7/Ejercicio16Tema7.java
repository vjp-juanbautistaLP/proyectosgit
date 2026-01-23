/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg16.tema7;
import java.util.Scanner;
/**
 *
 * @author Juan
 */
public class Ejercicio16Tema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //Arrays de alumnos y asignaturas
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};

        //Matriz de notas de filas son alumnos y columnas son asignaturas es decir: 6 alumnos x 4 asignaturas
        double[][] notas = new double[alumnos.length][asignaturas.length];

        int opcion;//Nos creamos la variable para guardar la opción

        //Hacemos un do-while para repetir el menú hasya que el usuario elija salir
        do {
            //Mostramos el menu
            System.out.println("\nMENU");
            System.out.println("1.Rellanr notas");
            System.out.println("2.Mostrar notas");
            System.out.println("3.Mejor alumno (media mas alta)");
            System.out.println("4. Alumno con mas suspensos");
            System.out.println("5. Asignatura mas dificil");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            
            //Lee la opcion elegida
            opcion = entrada.nextInt();
            
            //Hacemos un switch pra ejecutar la opcion seleccionada por el usuario
            switch (opcion) {

                // OPCIÓN 1: Rellenar las notaas de todos los alumnos
                case 1:
                    //Recorremos todos los alumnos(filas
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("Alumno: " + alumnos[i]);
                        //Para cada alumno , recorremos todas las asignaturas (columnas)
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.print("Nota de " + asignaturas[j] + ": ");
                            //Guardamos la nota en la matriz en la posicon [i][j]
                            notas[i][j] = entrada.nextDouble();
                        }
                    }
                    //Ponemos el break para salir del swicth y no ejecutar otros casos
                    break;

                // OPCIÓN 2: Mostrar las notas de todos los alumnos
                case 2:
                    //Recorremos cada alumno
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println("\nAlumno: " + alumnos[i]);
                        //Mostramos cada asignatura y su nota
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.println(asignaturas[j] + ": " + notas[i][j]);
                        }
                    }
                    break;

                // OPCIÓN 3: Mostrar Mejor alumno (media más alta)
                case 3:
                    //Guardará la mejor media encontrada
                    double mejorMedia = 0;
                    //Guardara la posicion del alumno que tiene esa mejor media
                    int posMejor = 0;
                    //Declaramos la variable suma
                    double suma;
                    //Recorremos alumnos para calcular la media de cada uno
                    for (int i = 0; i < alumnos.length; i++) {
                        //Suma acumula las notas de ese alumno
                        suma =0;
                        //Sumamos las notas de todas las asignaturas del alumno i
                        for (int j = 0; j < asignaturas.length; j++) {
                            suma += notas[i][j];
                        }
                        //Calcula la media del alumno
                        double media = suma / asignaturas.length;
                        //Comprobamos si es la mejor media
                        if (i == 0 || media > mejorMedia) {
                            mejorMedia = media;
                            posMejor = i;
                        }
                    }

                    System.out.println("El mejor alumno es " + alumnos[posMejor]
                            + " con media " + mejorMedia);
                    break;

                // OPCIÓN 4: Alumno con más suspensos
                case 4:
                    //Guardamos el máximo número de suspensos encontrado
                    int maxSuspensos = 0;
                    //Guardamos la posicion del alumno con más suspensos
                    int posSuspensos = 0;
                    //Declaramos la variable suspensos
                    int suspensos;
                    //Recorremos alumnos
                    for (int i = 0; i < alumnos.length; i++) {
                        //Contador de suspensos del alumno i
                        suspensos=0;
                        //Recorremos asignaturas para contar cuantas notas suspensas( <5) tiene
                        for (int j = 0; j < asignaturas.length; j++) {
                            if (notas[i][j] < 5) {
                                suspensos++;
                            }
                        }
                        
                        //Si el primer alumno o si tiene mas suspenso que el máximo, actualizamos maxSuspensoad y pos Suspensoas
                        if (i == 0 || suspensos > maxSuspensos) {
                            maxSuspensos = suspensos;
                            posSuspensos = i;
                        }
                    }
                    //Mostramos el alumno con más suspensos
                    System.out.println("El alumno con mas suspensos es "
                            + alumnos[posSuspensos] + " (" + maxSuspensos + " suspensos)");
                    break;

                // OPCIÓN 5: Asignatura más difícil (media más baja)
                case 5:
                    //Guardamos la media más baja encontrada
                    double peorMedia = 0;
                    //Guardamos la posicion de la asignatura con peor media
                    int posAsignatura = 0;
                    
                    //Recorremos asignaturas
                    for (int j = 0; j < asignaturas.length; j++) {
                        //Acumala las notas de TODOS los alumnos en esa asignatura
                        suma=0;
                        //Recorremos alumnos para sumar notas de la asignatura j
                        for (int i = 0; i < alumnos.length; i++) {
                            suma += notas[i][j];
                        }
                        double media = suma / alumnos.length;
                        //Si es la primera asignatura o su media es menor que la peor media,actualizamos peroMedia y guardamos la posicon
                        if (j == 0 || media < peorMedia) {
                            peorMedia = media;
                            posAsignatura = j;
                        }
                    }
                    //Mostramos la asignatura con media más baja
                    System.out.println("La asignatura más difícil es "
                            + asignaturas[posAsignatura]
                            + " con media " + peorMedia);
                    break;

                // OPCIÓN 6: Salir
                case 6:
                    //Mostramos que se esta saliedo del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    //Si el usuario escribe un número fuera del 1 al 6
                    System.out.println("Opción incorrecta");
            }
            //El do while repite el menu mientras ñaopcion sea distinta de 6
        } while (opcion != 6);

        entrada.close();
    }

}
