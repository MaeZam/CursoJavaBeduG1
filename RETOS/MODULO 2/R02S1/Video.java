public class Video extends MaterialCurso {
    private final int duracion; // en minutos

    public Video(String titulo, String autor, int duracion) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    public int getDuracion() { return duracion; }

    @Override
    public void mostrarDetalle() {
        System.out.println("Título del Video: " + getTitulo() + " - Autor: " + getAutor() + " - Duración: " + duracion + " min");
    }
}