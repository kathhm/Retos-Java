package Reto02;

public abstract class MetodoPago {
    double monto;

    public MetodoPago(double monto){
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("El tipo de pago fue realizado con: " + monto );
    }

}
