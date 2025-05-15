package Reto01;

public class Pasajero {
    String nombre;
    String pasaporte;

    public Pasajero(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    public String getNombre(){
        return nombre;
    }

    public String getPasaporte(){
        return pasaporte;
    }
}
