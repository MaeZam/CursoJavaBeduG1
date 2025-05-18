import javax.crypto.spec.PSource;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
public class Main {
    public static void main(String[] args) {

        //lista concurrente
        CopyOnWriteArrayList temas= new CopyOnWriteArrayList<>();
        //lista de temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Arte y expresión", 2));
        temas.add(new Tema("Historia mundial", 3));



        //Lectura de los temas activos
        System.out.println("Temas actualmente activos:");
        for (Object tema : temas){ //uso del objeto tema
            System.out.println(tema);
        }

        //Lectura en orden alfabetico
        Collections.sort(temas); // Se ordenan de forma natural
        System.out.println("\nTemas ordenados alfabeticamente");
        for (Object orden : temas){
            System.out.println(orden);
        }

        //Orden por prioridad ascendente (1->3 //es un orden personalizado
        temas.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema a, Tema b){
                return Integer.compare(a.prioridad, b.prioridad);//evaluacion de los valores de orden de prioridad
            }
        });

        //Lectura en orden de prioridad
        System.out.println("\n🔥 Temas en Orden de Prioridad");
        for (Object tema : temas){ //es necesario aclarar que es desde un objeto que es de la clase Tema
            System.out.println(tema);
        }

        //Repositorio:
        ConcurrentHashMap<String,String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");

        //Lectura de los recursos
        System.out.println("\nRepositorio de Recursos");
        for (Map.Entry<String, String> recurso : recursos.entrySet()){
            System.out.println("Recurso: " + recurso.getKey() + " Disponible en: " + recurso.getValue());
        }
    }
}
