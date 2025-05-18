import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usamos un Map para asociar servidores con sus consumos
        Map<String, Double> registrosCPU = new HashMap<>();
        double totalConsumo = 0;
        double maxConsumo = 0;
        double minConsumo = 100;
        int contadorServidores = 0;

        try {
            System.out.println("📊 MONITOR DE CONSUMO CPU 📊");
            System.out.println("Ingresa el nombre del servidor y su consumo de CPU (%). Escribe 'salir' para terminar.");

            while (true) {
                System.out.print("\nNombre del servidor (o 'salir'): ");
                String nombreServidor = scanner.next();

                if (nombreServidor.equalsIgnoreCase("salir")) {
                    break;
                }

                System.out.print("Consumo CPU (%): ");
                double valor = scanner.nextDouble();

                // Validación de rango
                if (valor < 0 || valor > 100) {
                    System.out.println("❌ Valor fuera de rango. Debe estar entre 0 y 100.");
                    continue;
                }

                // Verificación de duplicados
                if (registrosCPU.containsKey(nombreServidor)) {
                    System.out.println("⚠️ Ya existe un registro para el servidor: " + nombreServidor);
                    continue;
                }

                // Verificación de consumo crítico
                if (valor > 95) {
                    throw new ConsumoCriticoException("🚨 ALERTA: Consumo crítico detectado en "
                            + nombreServidor + " (" + valor + "%)");
                }

                // Actualizar estadísticas
                totalConsumo += valor;
                maxConsumo = Math.max(maxConsumo, valor);
                minConsumo = Math.min(minConsumo, valor);
                contadorServidores++;

                // Registrar el servidor
                registrosCPU.put(nombreServidor, valor);
                System.out.println("✅ Servidor registrado: " + nombreServidor + " - " + valor + "%");
            }

            // Mostrar resumen
            if (contadorServidores > 0) {
                System.out.println("\n📋 RESUMEN DE MONITOREO 📋");
                System.out.println("Total de servidores monitoreados: " + contadorServidores);
                System.out.printf("Consumo promedio: %.2f%%\n", totalConsumo / contadorServidores);
                System.out.printf("Consumo máximo: %.2f%%\n", maxConsumo);
                System.out.printf("Consumo mínimo: %.2f%%\n", minConsumo);

                System.out.println("\n📊 DETALLE POR SERVIDOR 📊");
                for (Map.Entry<String, Double> entrada : registrosCPU.entrySet()) {
                    String indicador = "";
                    double consumo = entrada.getValue();

                    if (consumo > 80) {
                        indicador = "⚠️ (Alto)";
                    } else if (consumo > 50) {
                        indicador = "🔶 (Medio)";
                    } else {
                        indicador = "✅ (Normal)";
                    }

                    System.out.printf("%-15s: %6.2f%% %s\n",
                            entrada.getKey(), consumo, indicador);
                }
            } else {
                System.out.println("No se registraron servidores.");
            }

        } catch (InputMismatchException e) {
            System.out.println("❌ Error: Formato de entrada incorrecto. Debes ingresar valores numéricos válidos.");
            scanner.nextLine(); // Limpiar buffer
        } catch (ConsumoCriticoException e) {
            System.out.println(e.getMessage());
            System.out.println("⚠️ Se ha detectado un consumo crítico. Se recomienda revisar inmediatamente.");
        } catch (Exception e) {
            System.out.println("❌ Error inesperado: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("\n📦 Recursos cerrados correctamente.");
        }
    }
}