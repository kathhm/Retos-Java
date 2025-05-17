package Reto01;

public class Patrulla extends UnidadEmergencia{

    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public Patrulla(String nombre, Sirena sirena, SistemaGPS gps, Operador operador) {
        super(nombre);
        this.sirena = sirena;
        this.gps = gps;
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("La patrulla ha sido enviada 🚔🚔");

    }

    public void iniciarOperacion(){
        super.activarUnidad();
        gps.localizar();
        sirena.activarSirena();;
        operador.reportarse();
        this.responder();
    }
}
