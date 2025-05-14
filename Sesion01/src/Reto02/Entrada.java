package Reto02;

public class Entrada {
    String nombreEvento;
    double price;

    public Entrada(String nombreEvento, double price){
        this.nombreEvento = nombreEvento;
        this.price = price;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + price);
    }
}
