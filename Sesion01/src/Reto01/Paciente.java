package Reto01;

import java.util.Scanner;

public class Paciente {

    String nombre;
    int edad;
    String expediente;

    public Paciente() {
    }

    //Metodo para pedir al usuario los datos del paciente
    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del paciente: ");
        nombre = sc.nextLine();

        System.out.println("Ingresa el número de expediente del paciente: ");
        expediente = sc.nextLine();

        System.out.println("Ingresa la edad del paciente: ");
        edad = sc.nextInt();

    }

    public void mostrarInformacion(){
        System.out.println("El nombre del paciente es " + nombre + ", el número de expediente es: " + expediente + " y su edad es: " + edad + "años");
    }

}
