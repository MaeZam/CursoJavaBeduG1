import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        // Ruta del archivo a analizar
        String rutaArchivo = "errores.log";

        try {
            // Llamar al método que analiza el archivo
            analizarArchivo(rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error procesando el archivo: " + e.getMessage());
            registrarError(e);
        }
    }

    /**
     * Funciones el archivo de logs y muestra estadísticas
     */
    private static void analizarArchivo(String rutaArchivo) throws IOException {
        // Contadores para estadísticas
        int totalLineas = 0;
        int contadorErrores = 0;
        int contadorAdvertencias = 0;

        // Uso de try-with-resources para garantizar el cierre del recurso
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            // Leer el archivo línea por línea
            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                // Contar ocurrencias de patrones
                if (linea.contains("ERROR")) {
                    contadorErrores++;
                }

                if (linea.contains("WARNING")) {
                    contadorAdvertencias++;
                }
            }

            // Calcular porcentaje (evitando división por cero)
            double porcentaje = totalLineas > 0 ?
                    ((double)(contadorErrores + contadorAdvertencias) / totalLineas) * 100 : 0;

            // Mostrar resultados
            System.out.println("===== RESUMEN DE ANÁLISIS =====");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + contadorErrores);
            System.out.println("Cantidad de advertencias: " + contadorAdvertencias);
            System.out.printf("Porcentaje de líneas con problemas: %.2f%%\n", porcentaje);
            System.out.println("===============================");
        }
    }

    /**
     * Registra mensajes de error en un archivo de registro
     */
    private static void registrarError(Exception e) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter("registro_fallos.txt"))) {
            escritor.println("Error al procesar el archivo de logs: " + e.getMessage());
            e.printStackTrace(escritor);
            System.out.println("El error ha sido registrado en 'registro_fallos.txt'");
        } catch (IOException ex) {
            System.err.println("Error adicional al intentar registrar el fallo: " + ex.getMessage());
        }
    }
}