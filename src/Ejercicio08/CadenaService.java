package Ejercicio08;


import java.util.Scanner;
public class CadenaService {
 
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena ingresarCadena(){
        Cadena cadena = new Cadena();
        System.out.println("Ingrese una frase: ");
        String frase = leer.next();
        cadena.setCadena(frase);
        cadena.setLongitud(frase.length());
        
        return cadena;
    }
    
    public int mostrarVocales(Cadena cadena){
        int vocales = 0;
       
        for (int i = 0; i < cadena.getLongitud(); i++) {
            char letra = cadena.getCadena().charAt(i);
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        return vocales;
    }

    public void invertirFrase(Cadena cadena){
        String fraseInvertida = " ";
        for (int i = cadena.getLongitud(); i > 0; i--) {
            fraseInvertida += cadena.getCadena().substring(i - 1, i);
        }
        System.out.println(fraseInvertida);
    }
    
    public int vecesRepetido(Cadena cadena, String letra){
        int cont = 0;
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (letra.equals(cadena.getCadena().substring(i, i + 1))) {
                cont++;
            }
        }
        return cont;
    }
    
    public void compararLongitud(Cadena cadena, String frase){
        if (frase.length() == cadena.getLongitud()) {
            System.out.println("Ambas frases tienen la misma logitud");
        }else if (frase.length() > cadena.getLongitud()) {
            System.out.println("La segunda frase es más larga que la primera");
        }else{
            System.out.println("La primera frase es más larga que la segunda");
        }
    }
    
   public void unirFrases(Cadena cadena, String frase){
       System.out.println("La nueva frase resultante de la unión es: " + cadena.getCadena() + ", " + frase);
   }
   
   public void reemplazar(Cadena cadena, String letra){
       System.out.println("La nueva frase luego de reemplazar las a: " + cadena.getCadena().replaceAll("a", letra));
   }
   
   
   public boolean contiene(Cadena cadena, String letra){
       return cadena.getCadena().contains(letra);
   }
   
   
   
}


    

