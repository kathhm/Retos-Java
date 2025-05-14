package Reto02;

public class Principal {
    public static void main(String[] args){
        Entrada concierto = new Entrada("Concierto de Caifanes", 800);
        Entrada obra = new Entrada("El sótano", 600);

        concierto.mostrarInformacion();
        obra.mostrarInformacion();

        //implementacion de la clase Entrada_record
        Entrada_record entrada = new Entrada_record("Concierto de Rock", 59.99);
        entrada.mostrarInformacion();
    }
}
