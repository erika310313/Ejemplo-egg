package ClasesEjemploDeLaGuia;

import java.util.Arrays;


public class Ejemplo04_ClaseArrays {

   
    public static void main(String[] args) {
        
        //Creamos un arreglo
        int arreglo1[] = {4,2,8,6,10};
        imprimirArreglo(arreglo1);
        
        
        //Método fill() - Método para inicializar arreglos con un valor determinado
        int arreglo2[] = new int[5];
        Arrays.fill(arreglo2, 7);
        imprimirArreglo(arreglo2);
        
        
        //Método copyOF() - Método que permite copiar el contenido de un arreglo en otro arreglo
        int arreglo3[] = Arrays.copyOf(arreglo1, 5);
        imprimirArreglo(arreglo3);
        
        
        //Método equals - Determina si dos arreglos son iguales
        if (Arrays.equals(arreglo1, arreglo2)) {
            System.out.println("Los arreglos son iguales");
        }else{
            System.out.println("Los arreglos son distintos");
        }
        
        if (Arrays.equals(arreglo1, arreglo3)) {
            System.out.println("Los arreglos son iguales");
        }else{
            System.out.println("Los arreglos son distintos");
        }
        
        
        //Método sort - Método para ordenar arreglos
        Arrays.sort(arreglo1);
        imprimirArreglo(arreglo1);
        
        
        //Método binarySerch - Sirve para buscar un elemento determinado en un arreglo. 
        //El método devuelvela posicion en la cual se enmcuentra el elemento
        int posicion = Arrays.binarySearch(arreglo1, 8);
        System.out.println("El elemento 8 se encuantra en la posicion: " + posicion);
        
    }
    
    public static void imprimirArreglo(int arreglo[]){
        System.out.println("**** ARREGLO ****");
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    
    }
    
}
