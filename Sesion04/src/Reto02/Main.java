package Reto02;

public class Main {
    public static void main(String[] args) {


        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("KKHHMM990501", 1500);

        CuentaFiscal cuenta = new CuentaFiscal("KKHHMM990501", 1500);

        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta?: " + rfcValido);
    }
}