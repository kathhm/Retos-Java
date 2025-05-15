package Reto02;

import java.util.Objects;

public class CuentaFiscal {
    private String rfc;
    private double saldoDisponible;


    public CuentaFiscal(String rfc, double saldoDisponible) {
        if (saldoDisponible < 0){
            throw new IllegalArgumentException("El saldo disponible no puede ser negativo.");
        }
        this.saldoDisponible = saldoDisponible;
        this.rfc = rfc;
    }

    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }


    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }


    public void mostrarCuenta() {
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}
