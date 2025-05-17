package Reto01;

public class Operador {
    String nombre;

    public Operador(String nombre) {
        this.nombre = nombre;
    }

    public void reportarse(){
        System.out.println("El/la operador/a" + nombre + " se ha reportado. 👩‍🦰");
    }
}
