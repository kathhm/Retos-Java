package Reto02;

public class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    //orden natural: por nombre del producto (alfábetico)
    @Override
    public int compareTo(Tema otro){
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Tema" + " " +
                "titulo='" + titulo + '\'' +
                ", prioridad=" + prioridad;
    }
}
