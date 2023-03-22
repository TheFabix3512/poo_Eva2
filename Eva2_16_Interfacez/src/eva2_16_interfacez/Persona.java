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
public class Persona implements Mostrar_Datos {
    String nombre;
    int edad;
            
            public Persona(){
                this.nombre="---";
                this.edad=0;
            }
            public Persona(String nombre, int edad){
                this.edad=edad;
                this.nombre=nombre;
            }

            
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Imprimir Datos ");
    }
    
  
    
}
