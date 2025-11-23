/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Test {
    public static void main(String[] args) {
        //Creamos las 3 direcciones
        Direccion d1 = new Direccion("Gran Via", 12, 3, "Madrid");
        Direccion d2 = new Direccion("Avenida del Sol", 45, 5, "Sevilla");
        Direccion d3 = new Direccion("Calle Luna", 8, 1, "Valencia");

        //Creamos los 3 Empleados 
        Empleado e1 = new Empleado("Carlos Lopez", 1500, d1);
        Empleado e2 = new Empleado("Maria Torres", 1800, d2);
        Empleado e3 = new Empleado(); // vacío
        e3.setNombre("Juan Perez");
        e3.setSalario(1700);
        e3.setDireccion(d3);

        //Mostramos los datos de cada empleado
        System.out.println("EMPLEADO 1 ");
        e1.mostrarDatos();

        System.out.println("EMPLEADO 2 ");
        e2.mostrarDatos();

        System.out.println("EMPLEADO 3 ");
        e3.mostrarDatos();
    }
}
