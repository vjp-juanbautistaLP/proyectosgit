/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author alumno
 */
public class ProductosFrescos extends Productos{
    private int fechaEnvasado;
    private String paisOrigen;
    
    //Constructor por defecto
    public ProductosFrescos(){
        super();
        fechaEnvasado = 0;
        paisOrigen = "";
    }
    //Contructor
    public ProductosFrescos(int fechaCaducidad, int numeroLote ,int fechaEnvasado ,String paisOrigen){
        super(fechaCaducidad , numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        
    }
    //Getters
    public int getfechaEnvasado(){
        return fechaEnvasado;
    }
    public String getpaisOrigen(){
        return paisOrigen;
    }
    
    //Setters
    public void setfechaEnvasado(){
        this.fechaEnvasado = fechaEnvasado;
    }
    public void setpaisOrigen(){
        this.paisOrigen = paisOrigen;
    }
    //Mostramos los datos
    
    public void MonstrarDatos(){
        System.out.println("Fecha de envasado" + fechaEnvasado);
        System.out.println("Pais de origen" + paisOrigen );
    }
}
