package Reto02;

public class Recursos implements Comparable<Recursos>{
    String titulo;
    String link;

    public Recursos(String titulo, String link) {
        this.titulo = titulo;
        this.link = link;
    }

    //orden natural: por nombre del producto (alfábetico)
    @Override
    public int compareTo(Recursos otro){
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Recursos" +
                "titulo='" + titulo + '\'' +
                ", link='" + link;
    }
}
