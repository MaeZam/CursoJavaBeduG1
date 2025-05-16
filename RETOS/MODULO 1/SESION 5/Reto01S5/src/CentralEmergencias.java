
public class CentralEmergencias {
    public static void main(String[] args) {

        //instancias de cada tipo de unidad
        Ambulancia ambulancia = new Ambulancia("Juan");
        Patrulla patrulla = new Patrulla("Laura");
        UnidadBomberos bomberos = new UnidadBomberos("Marco");

        //uso del metodo iniciar operacion para mostrar la informacion
        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();



    }
}