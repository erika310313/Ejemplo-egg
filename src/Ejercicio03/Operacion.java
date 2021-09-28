
package Ejercicio03;

import java.util.Scanner;

    /* Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main. */

public class Operacion {
    
    private int numero1;
    private int numero2;
    
    
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
        
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + ", numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
        
    public void crearOperacion(Operacion op1){
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese el número 1: ");
        op1.setNumero1(leer.nextInt());
        
        System.out.println("Ingrese el número 2: ");
        op1.setNumero2(leer.nextInt());
        
    }
    
    public int sumar(){
        
        int sumar = numero1 + numero2;
        
        return sumar;
        
    }
    
    public int restar(){
       int restar = numero1 - numero2;
        
        return restar;
        
    }
    
    public int multiplicar(){
        int multiplicar = 0;
        
        if(numero1 == 0 || numero2 == 0){
            System.out.println("Error, no puede multiplicar por cero");
        }else{
            multiplicar = numero1 * numero2;
        }
        
        return multiplicar;
        
    }
    
    public int dividir(){
        int dividir = 0;
        
        if(numero2 == 0){
            System.out.println("Error, no se puede dividir por cero");
        }else{
            dividir = numero1 / numero2;
        }
        return dividir;
        
    }
    
       
}
