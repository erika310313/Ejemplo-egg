
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

public class Ejercicio06 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CafeteraService cs = new CafeteraService();
        Cafetera cafetera1 = cs.crearCafetera();
        
        int opc;
        String opc2 = "";
        
        do{
            System.out.println("\n------------------- Menú de la Cafetera -------------------\n" + 
                               "\n 1.- Llenar Cafetera" +
                               "\n 2.- Mostrar la Cantidad de Café en la Cafetera" + 
                               "\n 3.- Servir Taza" + 
                               "\n 4.- Agregar Café" + 
                               "\n 5.- Vaciar la Cafetera" + 
                               "\n 6.- Salir");
            opc = leer.nextInt();
            
                while(opc < 1 || opc > 6){
                    System.out.println("La opción ingresada es incorrecta. Ingrese una opción válida: ");
                    opc = leer.nextInt();
                }
                
                switch(opc){
                    case 1: 
                        cs.llenarCafetera(cafetera1);
                        break;
                    
                    case 2:
                        cs.mostrarCantidadActual(cafetera1);
                        break;
                        
                    case 3:
                        System.out.println("Ingrese la capacidad de la taza en litros: ");
                        cs.servirTaza(cafetera1, leer.nextDouble());
                        break;
                        
                    case 4:
                        System.out.println("Ingrese la cantidad de café a agregar: ");
                        cs.agregarCafe(cafetera1, leer.nextDouble());
                        break;
                                                
                    case 5:
                        cs.vaciarCafetera(cafetera1);
                        break;
                        
                    case 6: 
                        System.out.println("¿Seguro desea salir? (S/N)");
                        opc = leer.nextInt();
                }
                
        } while(!opc2.equalsIgnoreCase("s"));
         
    }
    
}

