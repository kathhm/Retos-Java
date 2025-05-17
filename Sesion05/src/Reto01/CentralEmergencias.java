package Reto01;

public class CentralEmergencias {
    public static void main(String[] args){
        //creando los objetos requeridos primero para luego instanciar mis unidades
        SistemaGPS gps = new SistemaGPS();
        Sirena sirena = new Sirena();
        Operador operador = new Operador("José Luis");

        Patrulla patrulla = new Patrulla("Patrulla", sirena,gps, operador);

        patrulla.responder();
        patrulla.activarUnidad();
        patrulla.iniciarOperacion();

    }
}
