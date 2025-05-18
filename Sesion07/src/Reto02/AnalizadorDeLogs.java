package Reto02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        // Detecta la carpeta raíz del proyecto en tiempo de ejecución
        String baseDir = System.getProperty("user.dir");

        Path rutaLog = Paths.get(baseDir, "src", "Reto02", "errores.log");
        Path rutaError = Paths.get(baseDir, "src", "Reto02", "registro_fallos.txt");

        int totalLineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLog)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {
                    conteoWarnings++;
                }
            }

            System.out.println("📊 Análisis completado:");
            System.out.println("➡️ Total de líneas leídas: " + totalLineas);
            System.out.println("❌ Total de errores (ERROR): " + conteoErrores);
            System.out.println("⚠️ Total de advertencias (WARNING): " + conteoWarnings);

            double porcentajeErrores = (totalLineas > 0) ? ((double) conteoErrores / totalLineas) * 100 : 0;
            double porcentajeWarnings = (totalLineas > 0) ? ((double) conteoWarnings / totalLineas) * 100 : 0;

            System.out.printf("📈 Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("📉 Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);

        } catch (IOException e) {
            System.out.println("❌ Error al procesar el archivo de logs: " + e.getMessage());

            try {
                // Asegura que la carpeta exista antes de escribir
                Files.createDirectories(rutaError.getParent());
                try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                    escritor.write("Se produjo un error al leer el archivo 'errores.log': " + e.getMessage());
                }
            } catch (IOException ex) {
                System.out.println("❌ Además, no se pudo escribir en el archivo de registro de fallos: " + ex.getMessage());
            }
        }
    }
}
