//Importación de las librerías

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        try {
            // Definir la ruta del archivo usando Path y Paths.get()
            Path rutaArchivo = Paths.get("config", "parametros.txt");

            // Crear el contenido de los parámetros
            String parametros = "Tiempo de ciclo: 55.8 segundos\n" +
                    "Velocidad de línea: 1.2 m/s\n" +
                    "Número de estaciones: 8";

            // Guardar los parámetros en el archivo
            guardarParametros(rutaArchivo, parametros);

            // Verificar si el archivo existe
            if (Files.exists(rutaArchivo)) {
                System.out.println("Archivo creado correctamente en: " + rutaArchivo.toAbsolutePath());

                // Leer y mostrar el contenido del archivo
                String contenido = leerParametros(rutaArchivo);
                System.out.println("\n===== CONTENIDO DEL ARCHIVO =====");
                System.out.println(contenido);
                System.out.println("=================================");
            } else {
                System.out.println("Error: No se pudo crear el archivo.");
            }

        } catch (IOException e) {
            System.err.println("Error durante la operación: " + e.getMessage());
            e.printStackTrace();
        }
    }
    /**
     * Guarda los parámetros en el archivo especificado, creando los directorios necesarios.
     */
    private static void guardarParametros(Path ruta, String contenido) throws IOException {
        // Crear la carpeta si no existe
        Files.createDirectories(ruta.getParent());

        // Escribir en el archivo
        Files.writeString(ruta, contenido);
        System.out.println("Parámetros guardados exitosamente.");
    }
    /**
     * Lee y retorna el contenido del archivo especificado.
     */
    private static String leerParametros(Path ruta) throws IOException {
        return Files.readString(ruta);
    }

    }
