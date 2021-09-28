
package Ejercicio05;

import java.util.Scanner;

/* 
    Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    */
public class CuentaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        //pidiendole los datos al usuario
        
        Cuenta cuenta1 = new Cuenta();
        
        System.out.println("Ingrese su número de DNI: ");
        cuenta1.setDni(leer.nextLong());
        
        System.out.println("Ingrese el número de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese el saldo");
        cuenta1.setSaldo(leer.nextDouble());
        
        return cuenta1;
        
    }
    
    
    public void ingresarDinero(Cuenta cuenta1){
        double dinero;
        
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de dinero a ingresar a la cuenta: ");
        dinero = leer.nextDouble();
        cuenta1.setSaldo(cuenta1.getSaldo() + dinero);
        
        System.out.println("------------------------------------------------");
        System.out.println("Su saldo actualizado es: " + cuenta1.getSaldo());
    }
    
    
    public void retirarDinero(Cuenta cuenta1){
        double dinero;
        
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de dinero a retirar");
        dinero = leer.nextDouble();
        
        if(dinero < cuenta1.getSaldo()){
            cuenta1.setSaldo(cuenta1.getSaldo() - dinero);
        }else{
            System.out.println("Saldo insuficiente!!");
        }
        
        System.out.println("------------------------------------------------");
        System.out.println("Su saldo actualizado es: " + cuenta1.getSaldo());
        
    }
    
    
    public void extraccionRapida(Cuenta cuenta1){
        double dinero;
        dinero = 0;
        
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de dinero a retirar");
        dinero = leer.nextDouble();
        
        System.out.println(" ");
        if(dinero <= cuenta1.getSaldo() * 0.2){
            cuenta1.setSaldo(cuenta1.getSaldo() - dinero);
        }else{
            System.out.println("No se puede realizar esta transacción!!");
        }
        
        System.out.println("------------------------------------------------");
        System.out.println("Su saldo actualizado es: " + cuenta1.getSaldo());
    }
    
    
    public void consultarSaldo(Cuenta cuenta1){
        System.out.println(" ");
        System.out.println("El saldo disponible en la cuenta es: $"+ cuenta1.getSaldo());
        
    }
    
    
    public void consultarDatos(Cuenta cuenta1){
        
        System.out.println("---------------- Datos de la Cuenta---------------------- ");
        System.out.println("Número de DNI: " + cuenta1.getDni());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        
    }
    

    
    
    
    
    
    
    
}
