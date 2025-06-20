
import java.util.*;

public class GestionOrdenes {

    public static void mostrarOrdenes(List<? extends OrdenProduccion> lista) {
        System.out.println("\nÓrdenes registradas en el sistemas:");
        for (OrdenProduccion orden : lista) {
            orden.mostrarResumen();
        }
    }

    public static void procesarPersonalizadas(List<? super OrdenPersonalizada> lista, int costoAdicional) {
        System.out.println("\nProcesando las órdenes personalizadas...");
        for (Object obj : lista) {
            if (obj instanceof OrdenPersonalizada) {
                OrdenPersonalizada op = (OrdenPersonalizada) obj;
                System.out.println("Orden " + op.getCodigo() + " modificada con costo adicional de $" + costoAdicional);
            }
        }
    }

    // Contador de órdenes por tipo
    public static void contarOrdenes(List<? extends OrdenProduccion> lista) { 
        long masas = lista.stream().filter(o -> o instanceof OrdenMasa).count();// Contamos las órdenes de producción en masa
        long personalizadas = lista.stream().filter(o -> o instanceof OrdenPersonalizada).count();// Contamos las órdenes personalizadas
        long prototipos = lista.stream().filter(o -> o instanceof OrdenPrototipo).count(); // Contamos las órdenes de prototipo
        // Mostramos el resumen de conteo
        System.out.println("\nResumen total de órdenes:");
        System.out.println("Producción en masa: " + masas);
        System.out.println("Personalizadas: " + personalizadas);
        System.out.println("Prototipos: " + prototipos);
    }

    public static void main(String[] args) {
        List<OrdenProduccion> OrdenesTotal = new ArrayList<>();
        // Creamos algunas órdenes de diferentes tipos
        List<OrdenMasa> masas = Arrays.asList(
                new OrdenMasa("A123", 500),
                new OrdenMasa("A124", 750)
        );
        // Creamos algunas órdenes personalizadas y prototipos
        List<OrdenPersonalizada> personalizadas = Arrays.asList(
                new OrdenPersonalizada("P456", 100, "ClienteX"),
                new OrdenPersonalizada("P789", 150, "ClienteY")
        );
        // Creamos algunas órdenes de prototipo
        List<OrdenPrototipo> prototipos = Arrays.asList(
                new OrdenPrototipo("T789", 10, "Diseño"),
                new OrdenPrototipo("T790", 5, "Pruebas")
        );

        // Agregamos todas las órdenes a la lista combinada
        OrdenesTotal.addAll(masas);
        OrdenesTotal.addAll(personalizadas);
        OrdenesTotal.addAll(prototipos);

        // Mostrar órdenes por tipo
        mostrarOrdenes(masas);
        mostrarOrdenes(personalizadas);
        mostrarOrdenes(prototipos);

        // Procesar órdenes personalizadas
        procesarPersonalizadas(personalizadas, 200);

        //  Contar y mostrar el resumen de órdenes
        contarOrdenes(OrdenesTotal);
    }
}