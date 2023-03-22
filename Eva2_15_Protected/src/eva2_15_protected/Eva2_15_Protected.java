/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_protected;

import Prueva.Superclase;

/**
 *
 * @author Fabian b
 */
public class Eva2_15_Protected {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class SubClase extends Superclase{
    public void imprimirValor(){
        System.out.println("El valor es :"+ valor);
    }
}
