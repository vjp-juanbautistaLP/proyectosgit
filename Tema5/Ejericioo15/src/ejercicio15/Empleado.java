/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author alumno
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Constructor 
    public Empleado(String nombre , int salario ,Direccion direccion){
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    //Constructor por defecto
    public Empleado(){
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
        
       
    }
    //Getters
    public String getnombre(){
        return nombre;
    }
    public int getsalario(){
        return salario;
    }
    public Direccion getDireccion(){
        return direccion;
    }
    
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    
    //Mostramos los tados del empleado
    
    public void mostrarDatos(){
        System.out.println("Nombre" + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Dirección:");
        System.out.println("   Calle: " + direccion.getCalle());
        System.out.println("   Número: " + direccion.getNumero());
        System.out.println("   Piso: " + direccion.getPiso());
        System.out.println("   Ciudad: " + direccion.getCiudad());
        
    }
}
