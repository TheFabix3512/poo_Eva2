/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_interfacez;

/**
 *
 * @author Fabian b
 */
public abstract class  Producto  {
    private double Precio;
    private String Nombre;

    public Producto() {
    }

    public double getPrecio() {
        return Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
}
