/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3erenceia;

/**
 *
 * @author Fabian b
 */
public class Eva2_3erenceia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Estudiantes estu = new Estudiantes();
        estu.setNombre("Fabian");
        estu.setApellido("Bustillos");
        estu.setEdad(19);
        estu.setNcontrol(22550344);
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNcontrol());
    }
    
}
