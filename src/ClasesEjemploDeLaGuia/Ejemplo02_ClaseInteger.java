
package ClasesEjemploDeLaGuia;


public class Ejemplo02_ClaseInteger {

    
    public static void main(String[] args) {
        
        //Constructores
        Integer entero1 = new Integer("25");
        Integer entero2 = new Integer(50);
        Integer entero3 = 10;
        
        
        //Operaciones con objetos de la clase Integer
        Integer resultado = entero1 + entero2;
        System.out.println("La suma de entero1 y entero2 es: " + resultado);
        
        
        //Método conpareTo() - Compara dos objetos Integer numericamente
        if (entero1.compareTo(entero2) > 0) {
            System.out.println("Los valores enteros son iguales");
        }else{
            System.out.println("Los valores enteros son distintos");
        }
        
        
        //Métodos intValue() - Retorna el valor del Integer en tipo primitivo int
        int enteroPrimitivo1 = entero1.intValue();
        System.out.println("El valor entero primitivo 1 es: " + enteroPrimitivo1);
        
        int enteroPrimitivo2 = entero2.intValue();
        System.out.println("El valor entero primitivo 2 es: " + enteroPrimitivo2);
        
        
        //Método toString() - Retorna el valor del Integer en una cadena de caracteres
        String cadena = entero1.toString();
        System.out.println("El valor entero primitivo 1 es: " + cadena);
        
        
        //valueOf() - Retorna la cadena del parámetro en un objeto Integer
        int entero = Integer.valueOf("3");
        System.out.println("El valor entero es: " + entero);
        
    }
    
}
