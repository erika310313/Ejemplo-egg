
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
public class Ejercicio02 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        
        System.out.println("El area de la circunferencia es: " + c1.area(c1));
        System.out.println("El perimetro de la circunferencia es: "+c1.perimetro(c1));
        
       
    }
    
}
