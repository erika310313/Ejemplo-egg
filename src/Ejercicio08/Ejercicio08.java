
package Ejercicio08;

import java.util.Scanner;

/* Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. */

public class Ejercicio08 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
     
        CadenaService cs = new CadenaService();
        Cadena cad;
        int cantidad;
        String letra;
        
        cad = cs.ingresarCadena();
        System.out.println("La cantidad de vocales que tiene la frase que ingresó es: " + cs.mostrarVocales(cad));
        System.out.println("----------------------------------- \n");
        
        cs.invertirFrase(cad);
        System.out.println("----------------------------------- \n");
        
        System.out.println("Ingrese una letra");
        letra = leer.next();
        cantidad = cs.vecesRepetido(cad, letra);
        System.out.println("El caracter " + letra + " se repite " + cantidad + " veces.");
        System.out.println("----------------------------------- \n");
        
        System.out.println("Ingrese otra fase: ");
        String frase = leer.next();
        cs.compararLongitud(cad, frase);
        System.out.println("----------------------------------- \n");
        
        cs.unirFrases(cad, frase);
        System.out.println("----------------------------------- \n");
        
        System.out.println("Ingrese un caracter para reemplazar: ");
        letra = leer.next();
        cs.reemplazar(cad, letra);
        System.out.println("----------------------------------- \n");
        
        System.out.println("Ingrese una letra a buscar en la frase: ");
        letra = leer.next();
        
        if (cs.contiene(cad, letra)) {
            System.out.println("La frase contiene la letra " + letra);
        }else{
            System.out.println("La frase no contiene la letra " + letra);
        }
        
    }
   
}