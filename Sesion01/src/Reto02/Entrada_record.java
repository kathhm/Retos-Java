package Reto02;

public record Entrada_record(String nombreEvento, double price) {

    public void mostrarInformacion(){
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + price);
    }
}
