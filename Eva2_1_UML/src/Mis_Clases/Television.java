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
public class Television {
   int canal ;
   int volumen;
   boolean power;
   
   public int getCanal(){
       return canal;
       
   }
   public void setCanal(int x){
       canal = x;
       
   }
   public int getVolumen(){
       return volumen;
       
   }
   public void setVolumen(int x){
       volumen = x;
       
   }
   
   public boolean getPower(){
       return power;
       
   }
   public void setPower( boolean x){
      power = x;
      
   }
   
   public void imprimirDatos(){
       System.out.println("");
   }
   
   
   
}
