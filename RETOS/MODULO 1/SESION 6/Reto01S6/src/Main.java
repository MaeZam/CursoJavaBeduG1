import java.util.*;
public class Main {
    public static void main(String[] args) {

        //Registro de las muestras en el orden que han llegado con un ArrayList<>
        //"Homo sapiens", "Mus musculus", "Arabidopsis thaliana", "Homo sapiens"
        ArrayList<String> muestras = new ArrayList<>(); // Declaracion de la lista para guardar las muestras
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens"); //muestra repetida, en este caso sí se registra

        //muestra de la lista
        System.out.println("Muestras registradas: ");
        for (int i = 0; i < muestras.size(); i++){
            System.out.println(i + 1 +". " + muestras.get(i));
        }
        //uso de HashSet<String> para obtener la lista de especias unicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras); //Aquí se manda a llamar la lista muestras
        //impresión del resultado con el uso de HashSet
        System.out.println("\nMuestras únicas registradas: ");
        for (String especie : especiesUnicas){ //uso de for each
            System.out.println("Muestra: " + especie);
        }
        //uso de HashMap<String, string> para asocial el ID de muestra con el nombre del investigador
        HashMap<String, String> muestraInvestigador = new HashMap<>();
        muestraInvestigador.put("M-001", "Dra. López");
        muestraInvestigador.put("M-002", "Dr. Hernández");
        muestraInvestigador.put("M-003", "Dra. Rangel");
        //impresión los valores
        System.out.println("\nRelación de ID de muestra con su investigador(a): ");
        for (Map.Entry<String,String> dato : muestraInvestigador.entrySet()){ //uso de for each para realizar las relaciones
            System.out.println(dato.getKey() + "---" +dato.getValue());
        }

        //Una búsqueda por ID de muestra de forma dinámica
        String id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nIngresa el ID de la muestra si quieres ver quien es su investigador: ");
        id = scanner.nextLine();
        if (muestraInvestigador.containsKey(id)){ // evalua si el  id ingresado es el mismo valor de la muestra
            System.out.println("Investigador responsable de la muestra: " + id + muestraInvestigador.get(id));
        }else {
            System.out.println("Muestra no encontrada");
        }
    }
}