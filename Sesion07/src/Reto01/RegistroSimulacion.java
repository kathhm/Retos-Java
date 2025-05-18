package Reto01;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class RegistroSimulacion {
    public static void main(String[] args) {
        //definiendo la ruta del archivo
        Path rutaCarpeta = Paths.get("src/Reto01/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        //Contenido a escribir en el archivo
        String contenido = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8";
        try {
            // Paso 4: Crear la carpeta si no existe
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectories(rutaCarpeta);
                System.out.println("📁 Carpeta 'config' creada.");
            }

            // Escribir el contenido en el archivo (crea o sobrescribe)
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("✅ Archivo de parámetros escrito correctamente.");

            // Paso 5: Validar si el archivo fue creado
            if (Files.exists(rutaArchivo)) {
                System.out.println("📄 El archivo fue creado exitosamente en: " + rutaArchivo.toAbsolutePath());

                // Paso 6: Leer el contenido y mostrarlo
                String contenidoLeido = Files.readString(rutaArchivo);
                System.out.println("📋 Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("❌ El archivo no fue creado.");
            }

        } catch (IOException e) {
            System.out.println("❌ Error al trabajar con el archivo: " + e.getMessage());
        }

    }
}