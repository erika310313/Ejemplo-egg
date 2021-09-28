
package Ejercicio02;

import java.util.Scanner;

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:

a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/

public class Circunferencia {
    
    Scanner leer = new Scanner(System.in);
    
    private double radio;
    
    //Constructor que inicializa el radio pasado como parámetro
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    //Costrutor vacio
    public Circunferencia(){
        
    }

    //Método get
    public double getRadio() {
        return radio;
    }
    
    //Método set
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Método que pida el radio y lo guarde en el atributo
    public void crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        setRadio(leer.nextDouble()); 
        
    }
    
    //Método para calcular el área de la circunferencia
    public double area(Circunferencia c1){
        double area = Math.PI * (radio * radio);
        
        return area;
    }
    
    //Método para calcular el perímetro
    public double perimetro(Circunferencia c1){
        double perimetro = 2 * Math.PI * radio;
        
        return perimetro;
    }
    
    
    
    
    
    
    
    
    
}





