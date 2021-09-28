
package ClasesEjemploDeLaGuia;


public class Ejemplo01_ClaseString {

    
    public static void main(String[] args) {
        
        //Constructores
        String nombre = new String("ALEJANDRO");
        
        //Asignacion
        String nombre1 = "LEANDRO";
        String nombre2 = "PABLO";
        String nombre3 = "LEANDRO";
        String apellido = " SPADARO";
        
        //Método equals - Retorna verdadero si la cadena es igual al objeto del parámetro
        
        if (nombre1.equals("LEANDRO")) {
            System.out.println("Nombre1 es igual a: " + nombre1);
        }
        
        if (nombre1.equals(nombre2)) {
            System.out.println("Nombre1 es igual a Nombre2");
        }else{
            System.out.println("Nombre 1 no es igual a Nombre2");
        }
        
        if (nombre1.equals(nombre3)) {
            System.out.println("Nombre1 es igual a Nombre3");
        }else{
            System.out.println("Nombre1 no es igual a Nombre3");
        }
        
        //Método length - Retorna la longitud de la cadena
        
        int longitud = nombre1.length();
        System.out.println("Longitud de la cadena: " + longitud);
        
        
        //Método substring - Retorna la subcadena desde el caracter del primer parámetro hasta el segundo parámetro
        
        String parte = nombre1.substring(0, 3);
        System.out.println("Nombre completo: " + nombre1);
        System.out.println("Parte del nombre: " + parte);
        
        
        //Método valueOf - Convierte en cadena el dato del parámetro
        
        int valorEdad = 10;
        String edad = String.valueOf(valorEdad);
        System.out.println("La edad es: " + edad);
        
        //Método trim - Saca los espacios en blanco en los extremos de la cadena
        
        System.out.println("Apellido con espacios: " + apellido);
        
        apellido = apellido.trim();
        System.out.println("Apellido sin espacios: " + apellido);
        
        //Método toLowerCase - Retorna la cadena en minúsculas
        
        System.out.println("Cadena en mayúsculas: " + nombre1);
        String nombreEnMinuscula = nombre1.toLowerCase();
        System.out.println("Cadena en minúsculas: " + nombreEnMinuscula);
        
        
        //Método toUpperCase - Retorna la cadena en mayúsculas
        
        String nombre4 = "santiago";
        System.out.println("Cadena en minúsculas: " + nombre4);
        String nombreEnMayuscula = nombre4.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + nombreEnMayuscula);
        
        
        //MétodoindexOf - Retorna el índice de la primera ocurrencia de la cadena del parámetro
        
        String nombreApellido = "LEANDRO SPADARO";
        int posicion = nombreApellido.indexOf("E");
        System.out.println("Posición letra E: " + posicion);
        
        posicion = nombreApellido.indexOf("O");
        System.out.println("Posición letra O: " + posicion);
        
        posicion = nombreApellido.indexOf("Z");
        System.out.println("Posicion letra Z: " + posicion);
                
        
    }
    
}



