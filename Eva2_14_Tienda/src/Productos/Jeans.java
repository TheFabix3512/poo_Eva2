/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import SuperClases.Ropa;

/**
 *
 * @author Fabian b
 */
public class Jeans extends Ropa {
    private String material;
    private String corte;
    private double precio;

    public Jeans() {
        this.material = "";
        this.corte = "";
    }
    public Jeans(String material, String corte, String talla, String marca, String color, double precio, String descripcion, String unidadVenta) {
        super();
        this.material = material;
        this.corte = corte;
    }
    public String getMaterial() {return material;}
    
    public void setMaterial(String material) {this.material = material;}
    
    public String getCorte() {return corte;}
    
    public void setCorte(String corte) {this.corte = corte;}

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
  
    
    /*antes de cierta cantidad manejamos precio normal,
        despues de cierta cantidad hay descuento 
        
        */
    

    @Override
    public double precioVenta(int cant) {
         if(cant < 10)
            return precio * cant;
        else
            return(precio * 0.8) * cant;
    }
}

