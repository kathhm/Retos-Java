import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo Sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo Sapiens");

        System.out.println("Muestras de especies en el orden en el que llegaron:");
        for (int i = 0; i < muestras.size(); i++){
            System.out.println(i + 1 + "." + muestras.get(i));
        }

        HashSet<String> especiesUnicas = new HashSet<>(muestras);
        System.out.println("Muestras de especies únicas:");
        for (String especie : especiesUnicas){
            System.out.println("* " +especie);
        }

        //Use un HashMap<String, String> para asociar el ID de muestra con el nombre del investigador.
        //Ejemplo: ("M-001", "Dra. López"), ("M-002", "Dr. Hernández").
        HashMap<String, String> muestraID = new HashMap<>();
        muestraID.put("M-001","Dra. López");
        muestraID.put("M-002","Dr. Hernández");
        muestraID.put("M-003","Dr. José Luis");
        muestraID.put("M-004", "Dra. Canela");

        System.out.println("Muestras -> investigador");
        for (Map.Entry<String, String> entry : muestraID.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Búsqueda por ID de muestra");
        String idBuscar = "M-004";
        System.out.println("El/La investigador/a de la muestra " + idBuscar + " es: " + muestraID.get(idBuscar));


    }

}