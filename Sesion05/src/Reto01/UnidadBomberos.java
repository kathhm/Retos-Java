package Reto01;

public class UnidadBomberos extends UnidadEmergencia{

    SistemaGPS gps;
    Sirena sirena;
    Operador operador;

    public UnidadBomberos(String nombre, Sirena sirena, SistemaGPS gps, Operador operador) {
        super(nombre);
        this.sirena = sirena;
        this.gps = gps;
        this.operador = operador;
    }

    @Override
    public void responder() {
        System.out.println("La unidad de bomberos ha sido enviada 🚒🚒");
    }

    public void iniciarOperacion(){
        super.activarUnidad();
        gps.localizar();
        sirena.activarSirena();;
        operador.reportarse();
        this.responder();
    }

}
