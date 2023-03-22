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
public class Eva2_16_Interfacez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    /*   Mostrar_Datos obj = new Mostrar_Datos() {

            @Override
            public void imprimirdatos() {
                
            }*/
        
    Persona obj = new Persona("Fabian ", 18);
    obj.imprimirdatos();
    
    Computadora pc = new Computadora("intel i7", "hp");
     pc.imprimirdatos();
}
                }