package Ejercicio05;

import java.util.Scanner;


public class Ejercicio05 {
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
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Cuenta c1;
        CuentaServicio cs = new CuentaServicio();
        boolean salir;
        String opc = " ";
        int menu;
        
        c1 = cs.crearCuenta();
        
        do {
        System.out.println("");
        System.out.println("---------------------MENÚ---------------------");
        System.out.println("Indique la opción que desea realizar: " + "\n" + 
                            "Ingresar Dinero (1)" + "\n" +
                            "Retirar Dinero (2)" + "\n" + 
                            "Extracción Rápida (3)" + "\n" + 
                            "Consultar Saldo (4)" + "\n" + 
                            "Consultar Datos (5)" + "\n" + 
                            "Salir (6)");
        menu = leer.nextInt();
        
            while (menu < 1 || menu > 6){
                System.out.println("La opción ingresada no es valida. Intente nuevamente: ");
                menu = leer.nextInt();
            }
        
                switch (menu) {
                    case 1: //Ingresar dinero
                        cs.ingresarDinero(c1);
                        break;

                    case 2: //retirar dinero
                        cs.retirarDinero(c1);
                        break;

                    case 3: //extraccion rapida
                        cs.extraccionRapida(c1);
                        break;

                    case 4: //consultar saldo
                        cs.consultarSaldo(c1);
                        break;                

                    case 5: //consultar datos
                        cs.consultarDatos(c1);
                        break;

                    case 6: //salir
                        System.out.println("¿Seguro desea salir? (S/N)");
                        opc = leer.next();

                }
        } while (!opc.equalsIgnoreCase("s"));
 
    }
    
}
