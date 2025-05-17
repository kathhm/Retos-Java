package Reto01;

public class Ambulancia extends UnidadEmergencia {

    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public Ambulancia(String nombre, SistemaGPS gps, Sirena sirena, Operador operador){
        super(nombre);
        this.gps = gps;
        this.sirena = sirena;
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("La ambulancia ha sido enviada 🚑🚑");
    }

    public void iniciarOperacion(){
        super.activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        this.responder();
    }
}
