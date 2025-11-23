/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Juan
 */
public class ProductosCongelados extends Productos {
    private double temperaturaRecomendada;
    
    //Constructor por defecto
    public ProductosCongelados(){
        super();
        temperaturaRecomendada = 0;
    }
    //Constructor
    public ProductosCongelados(int fechaCaducidad , int numeroLote , double temperaturaRecomendada){
        super(fechaCaducidad , numeroLote);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    //Getters
    public Double gettemperaturaRecomendada(){
        return temperaturaRecomendada;
    }
    //Setters
    public void setctemperaturaRecomendada(){
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    //Mostramos los datos
    public void MonstrarDatos(){
        System.out.println("Temperatura Recomendada" + temperaturaRecomendada );
    }
}
