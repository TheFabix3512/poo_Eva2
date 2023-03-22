/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_abstractas_herencia;

/**
 *
 * @author Fabian b
 */
public class Circulo extends Figuras {
private double radio;
    
    public Circulo(){
        radio = -1;
    }
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea(){
        double area = Math.PI*(radio*radio);
        return area;
    }

    @Override
    public double calcularPerimietro() {
         double peri = Math.PI*2*radio;
        return peri;
    }
 
}
