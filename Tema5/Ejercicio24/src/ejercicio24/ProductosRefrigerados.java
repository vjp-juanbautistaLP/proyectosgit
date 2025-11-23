/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

/**
 *
 * @author Juan
 */
public class ProductosRefrigerados {
    public String codigoOrganismo;
    
    //Constructor por defecto
    public ProductosRefrigerados(){
        super();
        codigoOrganismo = "";
        
    }
    //Constructor
    public ProductosRefrigerados(int fechaCaducidad, int numeroLote ,String codigoOrganismo){
        super(fechaCaducidad , numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }
    //Getters
    public String getcodigoOrganismo(){
        return codigoOrganismo;
    }
    //Setters
    public String setcodigoOrganismo(){
        this.codigoOrganismo = codigoOrganismo;
    }
    
    //Mostrar los datos
    public void MostrarDatos(){
        System.out.println("Codigo de Organismo" + codigoOrganismo);
    }
}
