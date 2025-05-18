import java.util.*;

public class Tema implements Comparable<Tema>{
    //atributos
   public String titulo;
   public int prioridad;

   //constructor
    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

   //metodos para ordenar por titulo. con usos de Override para sobreescribir
    @Override
    public int compareTo(Tema otro){
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString(){
        return "Titulo: " + titulo + " | Orden de Prioridad: " + prioridad;
    }


}
