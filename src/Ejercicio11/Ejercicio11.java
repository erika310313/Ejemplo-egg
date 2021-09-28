//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
//la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
//clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
//pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
//de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
//fecha actual, que se puede conseguir instanciando un objeto Date con constructor
//vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
package Ejercicio11;

import java.util.Date;
import java.util.Scanner;


public class Ejercicio11 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int dia;
        int mes;
        int anio;
        
        System.out.println("Ingrese día(xx), mes(xx) y año(xxxx): ");
        System.out.println("Dia(xx): ");
        dia = leer.nextInt();
        System.out.println("Mes(xx): ");
        mes = leer.nextInt() - 1;
        System.out.println("Año(xxxx): ");
        anio = leer.nextInt() - 1900;
        
        Date fecha = new Date(anio, mes, dia);
        System.out.println("Fecha ingresada: " + fecha.toString());
        
        Date fechaActual = new Date();
        System.out.println("Fecha actual: " + fechaActual.toString());
        
        int diferencia = (fecha.getYear()+1900) - (fechaActual.getYear()+1900);
        if (diferencia > 0) {
            System.out.println("Los años transcurridos desde la fecha actual a la ingresada son: " + diferencia + " años");
        } else {
            System.out.println("Los años transcurridos desde la fecha ingresada a la actual son: " + Math.abs(diferencia) + " años");
        }
        
    }
    
}
