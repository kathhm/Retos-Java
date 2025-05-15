package Reto02;

public class Principal {
    public static void main(String[] args) {


        Factura factura = new Factura(1349, "Servicios médicos", "HIMK9905019M7");

        System.out.println(factura.getResumen());

        Factura cfdi = new Factura(1400, "Entretenimiento",null);
        System.out.println(cfdi.getResumen());
    }
}
