/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author alumno
 */
public class Productos {
    private int fechaCaducidad;
    private int numeroLote;
    
    //Constructor por defecto
    public Productos(){
        fechaCaducidad = 0;
        numeroLote = 0;
    }
    //Contructor
    public Productos(int fechaCaducidad , int numeroLote){
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }
    
    //Getters
    public int getfechaCaducidad(){
        return fechaCaducidad;
    }
    public int getnumeroLote(){
        return numeroLote;
    }
    
    //Setters
    public void setfechaCaducidad(){
        this.fechaCaducidad = fechaCaducidad;
    }
    public void setnumeroLote(){
        this.numeroLote = numeroLote;
    }
    
    //Mostramos los datos
    public void MostrarDatos(){
        System.out.println("Fecha de envasado" + fechaCaducidad);
        System.out.println("Numero de lote " + numeroLote);
    }
}
