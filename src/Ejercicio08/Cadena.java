
package Ejercicio08;


public class Cadena {
    private String cadena;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.cadena = frase;
        this.longitud = longitud;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
}
