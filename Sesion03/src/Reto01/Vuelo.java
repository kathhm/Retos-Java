package Reto01;

public class Vuelo {
    final String codigo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado = null;

    public Vuelo(String codigo, String destino, String horaSalida){
        this.codigo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }

    public boolean reservarAsiento(Pasajero p) {
        if(asientoReservado != null){
            return false;
        }else{
            asientoReservado = p;
            return true;
        }
    }

    public boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero pasajero = new Pasajero(nombre,pasaporte);
        return reservarAsiento(pasajero);
    }

    public void cancelarReserva(){
        if(asientoReservado != null) {
            asientoReservado = null;
            System.out.println("La reserva ha sido cancelada.");
        }else{
            System.out.println("No existe una reserva para cancelar.");
        }
    }


    public String obtenerItinerario() {
        // Asegúrate de que asientoReservado no sea null antes de acceder a sus propiedades
        String pasajeroInfo = (asientoReservado != null) ? asientoReservado.getNombre() + " (" + asientoReservado.getPasaporte() + ")" : "No hay pasajero reservado";

        // Retorna el itinerario con el nombre del pasajero o un mensaje si no hay pasajero
        return "Itinerario del vuelo🛩️\nCódigo: " + codigo + "\nDestino: " + destino + "\nSalida: " + horaSalida + "\nPasajero: " + pasajeroInfo;
    }
}
