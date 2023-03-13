/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mis_Clases;

/**
 *
 * @author Fabian b
 */
public class persona {
    private String id ;
   private String nombre ;
    private int edad;
    
    public String getId (){
        return id;
    }
    public String  getNombre (){
        return nombre;
    }
    public int getEdad (){
        return edad;
    }
    public void setId(String x){
        id=x;
    }
    
    public void setNombre(String x){
        x=nombre;
    }
    
    public void setEdad(int x){
        x= edad;
    }
    public void imprimirDatos(){
        System.out.println("id = "+id+"\n Nombre: "+nombre+"\n Edad:"+edad);
    }
}
