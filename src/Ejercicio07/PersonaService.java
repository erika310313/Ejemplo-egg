
package Ejercicio07;

import java.util.Scanner;

/* Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores. */
public class PersonaService {
    
//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje
    //nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        Persona p = new Persona();
        
        System.out.println("Ingrese su nombre: ");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad: ");
        p.setEdad(leer.nextInt());
        System.out.println("Indique su sexo (F, M, O): ");
        p.setSexo(leer.next());
        
            while(!p.getSexo().equalsIgnoreCase("f") && !p.getSexo().equalsIgnoreCase("m") && !p.getSexo().equalsIgnoreCase("o")){
                System.out.println("La letra ingresada es incorrecta. Intente nuevamente: ");
                p.setSexo(leer.next());
            }
        
        System.out.println("Indique su peso: ");
        p.setPeso(leer.nextDouble());
        System.out.println("Indique su altura: ");
        p.setAltura(leer.nextDouble());
       
        System.out.println("--------------------------------------------------");
        System.out.println("Nombre: " + p.getNombre() + "\n" + 
                           "Edad: " + p.getEdad() + "\n" + 
                           "Sexo: " + p.getSexo() + "\n" + 
                           "Peso: " + p.getPeso() + "\n" + 
                           "Altura: " + p.getAltura());
        System.out.println("--------------------------------------------------");
        
        return p;
                
    }
    
//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). 
//Si esta fórmula da por resultado un valor menor que 20, la función devuelve un -1. 
//Si la fórmula da por resultado un número entre 20 y 25(incluidos), significa que el 
//peso está por debajo de su peso ideal y la función devuelve un 0. 
//Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la 
//persona tiene sobrepeso, y la función devuelve un 1. 
//Se recomienda hacer uso de constantes para devolver estos valores.
    
    public int calcularIMC(Persona p){
    
        double IMC = p.getPeso() / Math.pow(p.getAltura(), 2);
        
        final int pesoBajo = -1;
        final int pesoNormal = 0;
        final int pesoAlto = 1;
        
        System.out.println("Su peso es: " + p.getPeso());
        System.out.println(("Estamos calculando su IMC... " + p.getAltura() * p.getAltura()));
        System.out.println("Su IMC es: " + IMC);
            if(IMC < 20){
                return pesoBajo;
            }else if(IMC >= 20 && IMC <= 25){
                return pesoNormal;
            }else{
                return pesoAlto;
            }
           
}
    
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
    
    public boolean esMayorDeEdad(Persona p){
        boolean mayor = false;
        
        if(p.getEdad() >= 18){
            mayor = true;
        }
        return mayor;
    
       
    }
    
  
    
}
