/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio06tema11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author juan
 */
public class Campania {

    // Atributos
    private Set<Donacion> donaciones;
    private String nombre;

    // Constructores
    public Campania() {
        donaciones = new HashSet<>();
        nombre = "";
    }

    public Campania(Set<Donacion> donaciones, String nombre) {
        this.donaciones = donaciones;
        this.nombre = nombre;
    }

    // Getters y setters
    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Añadir donacion
    public void aniadirDonacion() {
        System.out.println();
        String nombre = pedirNombre();
        float cantidad = pedirCantidad();
        donaciones.add(new Donacion(nombre, cantidad));
    }

    // Mostrar donaciones
    public void mostrarDonaciones() {
        System.out.println();

        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            for (Donacion dona : donaciones) {
                System.out.println(dona);
            }
        }
    }

    // Buscar por nombre
    public void buscarPorNombre() {
        System.out.println();
        String nombreBuscado = nombreABuscar();

        boolean encontrado = false;

        for (Donacion dona : donaciones) {
            if (dona.getNombrePersona().equalsIgnoreCase(nombreBuscado)) {
                System.out.println(dona);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe ninguna donacion con ese nombre");
        }
    }

    // Numero de donaciones
    public int numeroDonaciones() {
        return donaciones.size();
    }

    // Total recaudado
    public float totalRecaudado() {
        float total = 0;

        for (Donacion dona : donaciones) {
            total += dona.getCantidad();
        }

        return total;
    }

    // Ordenar donaciones de mayor a menor
    public void ordenarDonaciones() {
        System.out.println();

        if (donaciones.isEmpty()) {
            System.out.println("No hay donaciones registradas");
        } else {
            Donacion[] vDonacion = new Donacion[donaciones.size()];
            donaciones.toArray(vDonacion);

            for (int i = 1; i < vDonacion.length; i++) {
                Donacion actual = vDonacion[i];
                int j = i - 1;

                while (j >= 0 && vDonacion[j].getCantidad() < actual.getCantidad()) {
                    vDonacion[j + 1] = vDonacion[j];
                    j--;
                }

                vDonacion[j + 1] = actual;
            }

            System.out.println("--DONACIONES ORDENADAS--");
            for (int i = 0; i < vDonacion.length; i++) {
                System.out.println(vDonacion[i]);
            }
        }
    }

    // Pedir nombre
    public String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del donante: ");
        return entrada.nextLine();
    }

    // Pedir cantidad
    public float pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cantidad a donar: ");
        return entrada.nextFloat();
    }

    // Pedir nombre a buscar
    public String nombreABuscar() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre a buscar: ");
        return entrada.nextLine();
    }

    @Override
    public String toString() {
        return "Donaciones: " + donaciones + "\nNombre: " + nombre;
    }
}
