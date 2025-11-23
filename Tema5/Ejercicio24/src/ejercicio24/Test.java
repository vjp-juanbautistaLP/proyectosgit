/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Juan
 */
public class Test {
    public static void main(String[] args){
        
        ProductosFrescos fresco = new ProductosFrescos(
                "25/12/2025", 101, "10/11/2025", "España"
        );

        ProductosRefrigerados refrigerado = new ProductosRefrigerados(
                "30/11/2025", 202, "ORG-9988"
        );

        ProductosCongelados congelado = new ProductosCongelados(
                "15/08/2026", 303, -18
        );

        System.out.println("=== Producto Fresco ===");
        fresco.mostrarInfo();

        System.out.println("\n=== Producto Refrigerado ===");
        refrigerado.mostrarInfo();

        System.out.println("\n=== Producto Congelado ===");
        congelado.mostrarInfo();

        // Probando constructor por defecto:
        System.out.println("\n=== Producto Fresco (por defecto) ===");
        ProductoFresco frescoDef = new ProductoFresco();
        frescoDef.mostrarInfo();

    }
}
