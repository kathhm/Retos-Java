package Reto02;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args){
        //Lista de temas
        List<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");

        //Orden Natural: por tema (comparable)
        Collections.sort(temas);
        System.out.println("Títulos de temas ordenados por título.");
        for(Tema tema : temas){
            System.out.println(tema);
        }

        //Orden personalizado: por prioridad (Comparator)
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema o1, Tema o2) {
                return Integer.compare(o1.prioridad, o2.prioridad);
            }
        });

        System.out.println("\nTítulos ordenados por prioridad (1 = alta):");
        for (Tema tema : temas){
            System.out.println(tema);
        }

    }
}
