//Realizar una clase llamada Matemática que tenga como atributos dos números reales
//con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
//un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
//usará el Math.random para generar los dos números y se guardaran en el objeto con
//su respectivos set. Deberá además implementar los siguientes métodos:
//
//20
//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package Ejercicio09;


public class Ejercicio09 {

    
    public static void main(String[] args) {
        
        MatematicaService ms = new MatematicaService();
        Matematica mat;
        
        mat = ms.crearMatematica();
        
        
        System.out.println("El número mayor es: " + ms.devolverMayor(mat));
        System.out.println("*****************************************************************");
        
        System.out.println("La potencia de los números es:  " + ms.calcularPotencia(mat));
        System.out.println("*****************************************************************");
        
        System.out.println("La raiz cuadrada del número menor es:  " + ms.calcularRaiz(mat));
        
        
        
        
        
    }
    
}
