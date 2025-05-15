package Reto02;

import java.util.Optional;

public class Factura {

    //atributos privados
    private double monto;
    private String descripcion;
    private Optional<String> rfc; //puede estar presente o no

    //metodos publicos
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen(){
        String rfcResumen = rfc.isPresent() ? rfc.get() : "No proporcionado";
        return "📝Reto02.Factura generada: \nDescripción: " + descripcion + "\nMonto: " + monto + "\nRFC: " + rfcResumen;
    }



}
