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
public class Computadora extends Producto
implements Mostrar_Datos{
        private String marca;
        private String procesador;

    public Computadora(String marca, String procesador) {
        this.marca = marca;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void imprimirdatos() {
        
        System.out.println("Procesador"+ getProcesador());
        
        
    }
        
        
    
    
    
}
