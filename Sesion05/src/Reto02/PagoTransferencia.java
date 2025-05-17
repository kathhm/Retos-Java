package Reto02;

import java.util.Arrays;
import java.util.List;

public class PagoTransferencia extends MetodoPago implements Autenticable {

    String banco;
    private static final List<String> BANCOS_VALIDOS = Arrays.asList("BancoA", "BancoB", "BancoC");


    public PagoTransferencia(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public boolean autenticar() {
        if (BANCOS_VALIDOS.contains(this.banco)) {
            System.out.println("Autenticación exitosa ✅.");
            return true;
        } else {
            System.out.println("Autenticación fallida, vuelva a intentarlo ✖️.");
            return false;
        }
    }

    @Override
    public void procesarPago () {
        if(this.autenticar()){
            System.out.println("Pago realizado por transferencia realizado con éxito.");
        }else{
            System.out.println("El pago no se realizó.");
        }
    }
}

