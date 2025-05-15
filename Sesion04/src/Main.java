public class Main {
    public static void main (String[] args){
        Factura factura = new Factura("KHM1999","Katherine Hinojosa", 2500);
        Factura cfdi = new Factura("KHM1999","Katherine Hinojosa", 2500);

        System.out.println(factura.toString());
        System.out.println(cfdi.toString());
        System.out.println("¿Las facturas son iguales? " + cfdi.equals(factura));
    }
}
