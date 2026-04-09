/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08tema11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author juan
 */
public class Ciudad {

    // Atributos
    private String nombre;
    private Set<Sede> sedes;

    // Constructores
    public Ciudad() {
        nombre = "";
        sedes = new HashSet<>();
    }

    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = sedes;
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
        sedes = new HashSet<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }

    // Añadir sede
    public void aniadirSede() {
        String nombreSede = pedirNombreSede();
        double ingresos = pedirIngresosSede();
        sedes.add(new Sede(nombreSede, ingresos));
    }

    // Mostrar sedes
    public void mostrarSedes() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            for (Sede sede : sedes) {
                System.out.println(sede);
            }
        }
    }

    // Calcular ingresos medios
    public double ingresosMedios() {
        if (sedes.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (Sede sede : sedes) {
            total += sede.getIngresos();
        }

        return total / sedes.size();
    }

    // Mostrar sedes con ingresos superiores a la media
    public void mostrarSedeSuperioresMedia() {
        if (sedes.isEmpty()) {
            System.out.println("No hay sedes registradas");
        } else {
            double media = ingresosMedios();
            System.out.println("La media de ingresos es: " + media);

            boolean alguna = false;

            for (Sede sede : sedes) {
                if (sede.getIngresos() > media) {
                    System.out.println(sede);
                    alguna = true;
                }
            }

            if (!alguna) {
                System.out.println("Ninguna sede supera la media");
            }
        }
    }

    // Buscar sede por nombre
    public boolean buscarSede(String nombreSede) {
        boolean encontrado = false;

        for (Sede sede : sedes) {
            if (sede.getNombreSede().equalsIgnoreCase(nombreSede)) {
                encontrado = true;
            }
        }

        return encontrado;
    }

    // Pedir nombre de sede
    public String pedirNombreSede() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre de la sede: ");
        return entrada.nextLine();
    }

    // Pedir ingresos
    public double pedirIngresosSede() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresos anuales: ");
        return entrada.nextDouble();
    }

    @Override
    public String toString() {
        return "Nombre de la ciudad: " + nombre + "\nSedes: " + sedes;
    }
}
