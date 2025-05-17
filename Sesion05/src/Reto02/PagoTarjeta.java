package Reto02;

public class PagoTarjeta extends MetodoPago implements Autenticable{
    double fondos;

    public PagoTarjeta(double monto, double fondos){
        super(monto);
        this.fondos = fondos;
    }

    @Override
    public boolean autenticar() {
        if (fondos >= monto) {
            System.out.println("Autenticación exitosa ✅");
            return true;
        } else {
            System.out.println("Autenticación fallida ✖️. Fondos insuficientes.");
            return false;
        }
    }

    @Override
    public void procesarPago() {
        if(this.autenticar()) {
            System.out.println("Procesando pago por: $" + monto);
        }else{
            System.out.println("El pago no pudo ser procesado.");
        }
    }


}
