package Reto02;

public class CajaRegistradora {
    public static void main (String[] args){
    MetodoPago[] metodoPago = {new PagoEfectivo(500),
                                new PagoTarjeta(500, 800),
                                new PagoTransferencia(500, "BancoA")
                                };

    for (MetodoPago pago : metodoPago) {
        pago.procesarPago();
    }




    }

}
