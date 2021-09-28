//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
//A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
//pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
//10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
//elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
//elementos y el combinado de 20.
package Ejercicio10;


public class Arreglos {
    private double[] arregloA = new double[50]; 
    private double[] arregloB = new double[20];

    public Arreglos() {
    }
    
    public Arreglos(double[] A, double[] B) {
        this.arregloA = A;
        this.arregloB = B;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }
    
    
    

    
}
