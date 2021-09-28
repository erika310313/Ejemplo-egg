
package Ejercicio07;
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

public class Ejercicio07 {

    
    public static void main(String[] args) {
        
        double porcPeso = 0.0;
        double porcEdad = 0.0;
        
        PersonaService ps1 = new PersonaService();
        
        Persona pers1 = ps1.crearPersona();
        Persona pers2 = ps1.crearPersona();
        Persona pers3 = ps1.crearPersona();
        Persona pers4 = ps1.crearPersona();
        
        System.out.println("---------- Persona 1 ----------");
        System.out.println(pers1.getNombre());
        mayoriaEdad(ps1.esMayorDeEdad(pers1));
        peso(ps1.calcularIMC(pers1));
        System.out.println("");
        
        System.out.println("---------- Persona 2 ----------");
        System.out.println(pers2.getNombre());
        mayoriaEdad(ps1.esMayorDeEdad(pers2));
        peso(ps1.calcularIMC(pers2));
        System.out.println("");
        
        System.out.println("---------- Persona 3 ----------");
        System.out.println(pers3.getNombre());
        mayoriaEdad(ps1.esMayorDeEdad(pers3));
        peso(ps1.calcularIMC(pers3));
        System.out.println("");
                
        System.out.println("---------- Persona 4 ----------");
        System.out.println(pers4.getNombre());
        mayoriaEdad(ps1.esMayorDeEdad(pers4));
        peso(ps1.calcularIMC(pers4));
        System.out.println("");
        
        System.out.println("---------- Cálculos y Porcentajes ----------");
        
        
        
    }
    
    
    
    public static void mayoriaEdad(boolean mayor){
        int contMayor = 0;
        int contMenor = 0;
        
        if(mayor == true){
            System.out.println("Es mayor de edad!");
            contMayor++;
        }else{
            System.out.println("Es menor de edad!");
            contMenor++;
        } 
    }

    public static void peso(int imc){
        int contPesoBajo = 0;
        int contPesoIdeal = 0;
        int contSobrePeso = 0;
        
        
        switch (imc) {
            case -1:
                System.out.println("La paersona esta baja de peso.");
                contPesoBajo++;
                break;
            case 0:
                System.out.println("La paersona esta en su peso ideal.");
                contPesoIdeal++;
                break;
            case 1:
                System.out.println("La persona tiene sobrepeso");
                contSobrePeso++;
                break;
        }
    }
    
}


