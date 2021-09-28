//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
//A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
//pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
//10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
//elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
//elementos y el combinado de 20.
package Ejercicio10;

import java.util.Arrays;

public class ArreglosService {
    
    public Arreglos crearArreglos(){
        Arreglos a = new Arreglos();
        
        for (int i = 0; i < 50; i++) {
            Arrays.fill(a.getArregloA(), i, i+1, Math.round((Math.random()*20)*100.0)/100);
        }
        System.out.println(Arrays.toString(a.getArregloA()));
        
        Arrays.sort(a.getArregloA());
        System.out.println(Arrays.toString(a.getArregloA()));
        
        a.setArregloB(Arrays.copyOfRange(a.getArregloA(), 0, 20));
        
        for (int i = 10; i < 20; i++) {
            Arrays.fill(a.getArregloB(), i, i+1, 0.5);
        }
        
        System.out.println(Arrays.toString(a.getArregloB()));
        
        
        return a;
    }
    
    
}

