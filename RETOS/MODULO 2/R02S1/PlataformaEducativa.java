import java.util.*;
import java.util.function.Predicate;

public class PlataformaEducativa {

    public static void mostrarMateriales(List<? extends MaterialCurso> lista) {
        System.out.println("\nRecursos  del curso:");
        for (MaterialCurso material : lista) {
            material.mostrarDetalle();
        }
    }
    // Contar duración total de videos
    public static void contarDuracionVideos(List<? extends Video> lista) {
        int total = 0;
        for (Video video : lista) {
            total += video.getDuracion();
        }
        System.out.println("\nDuración total de videos: " + total + " minutos");
    }
    // Marcar ejercicios como revisados
    public static void marcarEjerciciosRevisados(List<? super Ejercicio> lista) {
        System.out.println();
        for (Object obj : lista) {
            if (obj instanceof Ejercicio) {
                Ejercicio e = (Ejercicio) obj;
                e.setRevisado(true);
                System.out.println("Ejercicio '" + e.getTitulo() + "' marcado como revisado.");
            }
        }
    }

    // Filtrar materiales por autor
    public static void filtrarPorAutor(List<? extends MaterialCurso> lista, Predicate<MaterialCurso> filtro) {
        System.out.println("\nFiltrado de  materiales por autor:");
        for (MaterialCurso material : lista) {
            if (filtro.test(material)) {
                material.mostrarDetalle();
            }
        }
    }
// Clase principal para probar la plataforma educativa
    public static void main(String[] args) {
        // Crear materiales
        List<MaterialCurso> materiales = Arrays.asList(
                new Video("Introducción a Java", "Mario", 15),
                new Video("POO en Java", "Carlos", 20),
                new Articulo("Historia de Java", "Ana", 1200),
                new Articulo("Tipos de datos", "Luis", 800),
                new Ejercicio("Variables y tipos", "Luis"),
                new Ejercicio("Condicionales", "Mario")
        );

        // Filtrar cada tipo de material
        List<Video> videos = new ArrayList<>();
        List<Ejercicio> ejercicios = new ArrayList<>();
        for (MaterialCurso m : materiales) {
            if (m instanceof Video) {
                videos.add((Video) m);
            } else if (m instanceof Ejercicio) {
                ejercicios.add((Ejercicio) m);
            }
        }

        // Mostrar todos los materiales
        mostrarMateriales(materiales);

        // Contar duración total de videos
        contarDuracionVideos(videos);

        // Marcar ejercicios como revisados
        marcarEjerciciosRevisados(ejercicios);

        
        filtrarPorAutor(materiales, m -> m.getAutor().equals("Luis"));
    }
}