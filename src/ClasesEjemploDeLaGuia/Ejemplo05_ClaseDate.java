
package ClasesEjemploDeLaGuia;

import java.util.Date;


public class Ejemplo05_ClaseDate {

   
    public static void main(String[] args) {
        
        //Método constructores
        Date fecha1 = new Date();
        Date fecha2 = new Date(999990005555L); //8 de septiembre de 2001 20:05hs
        
        
        //Método toString() - Retorna la fecha en una cadena de caracteres
        String descripcionFecha1 = fecha1.toString();
        System.out.println(descripcionFecha1);
        
        String descripcionFecha2 = fecha2.toString();
        System.out.println(descripcionFecha2);
        
        
        //Método after() - Retorna verdadero si la fecha esta después de la fecha del parámetro
        if (fecha1.after(fecha2)) {
            System.out.println("La fecha 1 es posterior a la fecha 2");
        }else{
            System.out.println("La fecha 1 es anterior a la fecha 2");
        }
        
        
        //Método before() - Retorna verdadero si la fecha está antes de la fecha del parámetro
        if (fecha2.before(fecha1)) {
            System.out.println("La fecha 2 es anterior a la fecha 1");
        }else{
            System.out.println("La fecha 2 es posterior a la fecha 1");
        }
        
        
        //Método getTime() - Retorna la fecha en milisegundos
        long milisegundosFecha1 = fecha1.getTime();
        System.out.println("La cantidad de milisegundos de la fecha 1 es: " + milisegundosFecha1);
        
        long milisegundosFecha2 = fecha2.getTime();
        System.out.println("La cantidad de milisegundos de la fecha 2 es: " + milisegundosFecha2);
        
        
        //Método equals - Retorna verdaderi si la fecha es igual a la del objeto del parámetro
        if (fecha1.equals(fecha2)) {
            System.out.println("Las fechas son iguales");
        }else{
            System.out.println("Las fechas son diferentes");
        }
        
        
        //Método setTime - Asigna la fecha en milisegundos
        fecha2.setTime(milisegundosFecha1);
        if (fecha1.equals(fecha2)) {
            System.out.println("Las fechas son iguales");
        }else{
            System.out.println("Las fechas son diferentes");
        }
    
        
    }
    
}
