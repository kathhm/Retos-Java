package Reto02;

import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        CajeroAutomatico cajeroBBVA = new CajeroAutomatico(1000); //inicializo en 1000 mi cajero automatico
        Scanner sc = new Scanner(System.in);

        int choice;
        do{
            cajeroBBVA.mostrarMenu();
            System.out.println("Elige una opción del menú");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Su saldo actual es de: $" + cajeroBBVA.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad que quieres depositar: ");
                    double deposito = sc.nextDouble();
                    cajeroBBVA.depositarDinero(deposito);
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad que quieres retirar: ");
                    double retiro = sc.nextDouble();
                    cajeroBBVA.retirarDinero(retiro);
                    break;
                default:
                    System.out.println("Bye bye! gracias por usar el cajero de BBVA 🏧🤑💵💸");
                    break;

            }
        }   while(choice != 4);

        sc.close();

    }
}