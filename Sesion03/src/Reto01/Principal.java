package Reto01;

public class Principal {
    public static void main(String[] args){
        Pasajero pasajero = new Pasajero("Katherine","HINK990501NN");
        Vuelo Chetumal = new Vuelo("CTM24","Chetumal, Quintana Roo", "11:40 am");

        Chetumal.reservarAsiento(pasajero);
        System.out.println(Chetumal.obtenerItinerario());

        Chetumal.cancelarReserva();
        System.out.println(Chetumal.obtenerItinerario());

        Chetumal.reservarAsiento("Katherina","HIMK990501MMSNLT06");
        System.out.println(Chetumal.obtenerItinerario());

    }
}
