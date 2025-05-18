package Reto01;

public class TransicionSimple implements TransicionHistoria {
    public void realizarTransicion(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("➡️ El jugador decide explorar el bosque oscuro...");
        } else {
            System.out.println("➡️ El jugador regresa al pueblo en busca de ayuda...");
        }
    }
}
