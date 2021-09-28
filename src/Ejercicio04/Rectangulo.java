
package Ejercicio04;

import java.util.Scanner;

/* 
    Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2. 
    */

public class Rectangulo {
    
    Scanner leer = new Scanner(System.in);
    
    private int base;
    private int altura;
    
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    
    public Rectangulo(){
        
    }

    
    public int getBase() {
        return base;
    }

    
    public void setBase(int base) {
        this.base = base;
    }

    
    public int getAltura() {
        return altura;
    }

    
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /*
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    */
    
    
    public void crearRectangulo(){
        Rectangulo r1 = new Rectangulo();
        
        System.out.println("Ingrese la base del rectángulo: ");
        setBase(leer.nextInt());
        
        System.out.println("\n" + "Ingrese la altura del rectángulo: ");
        setAltura(leer.nextInt());
    }
    
    
    public int superficieRectangulo(Rectangulo r1){
        int superficie;
        
        superficie = (base * altura);
        
        return superficie;
    }
    
    
    public int perimetroRectangulo(Rectangulo r1){
        int perimetro;
        
        perimetro = (base * altura) * 2;  
        
        return perimetro;
    }
    
    
    public void dibujarRectangulo(Rectangulo r1){
        for (int i = 0; i < getAltura(); i++) {
            for (int j = 0; j < getBase(); j++) {
                if (i == 0 || i == getBase() - 1 || j == 0 || j == getBase() - 1 || i == getAltura() - 1) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println(" ");
        }
        
    }
    
  
    
}
