//• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
//valor
//• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
package Ejercicio09;


public class MatematicaService {
    
    public Matematica crearMatematica(){
        Matematica mat = new Matematica();
        
        mat.setNumero1(Math.random() * 10);
        mat.setNumero2(Math.random() * 10);
        
        System.out.println("El primer número aleatorio es: " + mat.getNumero1());
        System.out.println("El segundo número aleatorio es: " + mat.getNumero2());
        System.out.println("*****************************************************************");
    
        return mat;
    }
    
    public double devolverMayor(Matematica mat){
        if (mat.getNumero1() > mat.getNumero2()) {
            return mat.getNumero1();
        }else{
            return mat.getNumero2();
        }
    }
    
    
    public double calcularPotencia(Matematica mat){
        double mayor;
        double menor;
        
        if (mat.getNumero1() > mat.getNumero2()) {
            mayor = Math.round(mat.getNumero1());
            menor = Math.round(mat.getNumero2());
        }else{
            mayor = Math.round(mat.getNumero2());
            menor = Math.round(mat.getNumero1());
        }
        System.out.println("El núemro mayor es: " + mayor + " y el número menor es: " + menor);
        return Math.pow(mayor, menor);
    }
    
        
    public double calcularRaiz(Matematica mat){
        double mayor;
        double menor;
        
        if (mat.getNumero1() > mat.getNumero2()) {
            mayor = Math.round(mat.getNumero1());
            menor = Math.round(mat.getNumero2());
        }else{
            mayor = Math.round(mat.getNumero2());
            menor = Math.round(mat.getNumero1());
        }
        
        return Math.sqrt(Math.abs(menor));
    }
    
}
