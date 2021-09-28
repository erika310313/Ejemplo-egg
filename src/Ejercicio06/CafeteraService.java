
package Ejercicio06;

import java.util.Scanner;

/* 
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/

public class CafeteraService {
    
    public Cafetera crearCafetera(){
        
        Cafetera c1 = new Cafetera();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Indique la capacidad máxima de litros para la cafetera: ");
        c1.setCapacidadMaxima(leer.nextInt());
        System.out.println("Indique la cantidad actual de litros de café en la cafetera: ");
        c1.setCantidadActual(leer.nextInt());
        
        System.out.println("--------------------------------------------------");
        System.out.println("La capacidad de la cafetera es: " + c1.getCapacidadMaxima() + "lts");
        System.out.println("La cafetera tiene: " + c1.getCantidadActual() + "lts de café");
        
        return c1;
    }
    
        
    
//Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
//máxima.
    public void llenarCafetera(Cafetera c1){
        c1.setCantidadActual(c1.getCapacidadMaxima());
        
        System.out.println("--------------------------------------------------");
        System.out.println("Se llenó la cafetera");
        System.out.println("La cantidad actual de café es: " + c1.getCantidadActual() + "lts de café");
      
    }
    
    
//Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
    public void servirTaza(Cafetera c1, double medidaTaza){
                 
        if (medidaTaza < c1.getCantidadActual()){
            System.out.println("Se puede llenar la taza!");
            c1.setCantidadActual(c1.getCantidadActual() - medidaTaza);
            System.out.println("En la cafetera quedan " + c1.getCantidadActual() + "lts de cafe!");
        }else{
            System.out.println("No hay suficiente café para llenar la taza!");
            System.out.println("La taza contiene " + c1.getCantidadActual() + "lts de cafe!");
            
            c1.setCantidadActual(0);
        }
        
    }
    
    
//Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
        
        System.out.println("--------------------------------------------------");
        System.out.println("Se vacio la cafetera");
        System.out.println("La cantidad actual de café es: " + c1.getCantidadActual() + "lts de café");
    }
    
    
//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera c1, double cafeAdicional){
        
        if((c1.getCantidadActual() + cafeAdicional) >= c1.getCapacidadMaxima()){
            System.out.println("La cafetera se encuentra completamente llena");
            c1.setCantidadActual(c1.getCapacidadMaxima());
        }else{
            c1.setCantidadActual(c1.getCantidadActual() + cafeAdicional);
            System.out.println("La cafetera contiene " + c1.getCantidadActual() + " lts. de café");
        }
        
    }
    
//Mostrar la cafetera
    public void mostrarCantidadActual(Cafetera c1){
        System.out.println("La cantidad actual de café en la cafetera es: " + c1.getCantidadActual() + " lts.");
        
    }
    
    
    
}

  