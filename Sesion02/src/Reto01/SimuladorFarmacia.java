package Reto01;

import java.util.Scanner;

public class SimuladorFarmacia {
    String nombreMedicamento;
    double precio;
    int cantidad;


    public SimuladorFarmacia(){
    }

    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del medicamento: ");
        nombreMedicamento = sc.nextLine();

        System.out.println("Ingresa el precio del medicamento: ");
        precio = sc.nextDouble();

        System.out.println("Ingresa la cantidad de piezas: ");
        cantidad = sc.nextInt();

    }

    public void mostrarDatos(){
        var precioFinal = precio * cantidad;
        System.out.println("El medicamento " + nombreMedicamento + " tiene un costo de $" + precio + " pesos.");
        System.out.println(precioFinal >= 500 ? "El costo total es mayor de $500.00, por lo que se le aplicará un descuento del 15%." : "El precio total por " + cantidad + " piezas, sin descuento es: $" + precioFinal);
        System.out.println(precioFinal >= 500 ? "El costo total de su pedido con descuento es: $" + (precioFinal - (precioFinal*0.15)) + " Gracias por su compra." : "Gracias por su compra");
    }

}
