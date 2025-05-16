public class Operador {
    //atributo
    private String nombre;
     //constructor
    public Operador(String nombre){
        this.nombre = nombre;
    }

    //método concreto
    public void reportarse(){
        System.out.println("👷 Operador " + nombre + " reportaándose");
    }
}
