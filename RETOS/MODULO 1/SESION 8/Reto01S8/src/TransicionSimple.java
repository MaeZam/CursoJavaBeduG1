import java.util.HashMap;
import java.util.Map;

public class TransicionSimple implements TransicionHistoria{
    //Para guardar las transiciones en un HashMAp
    private Map<String, String> transiciones = new HashMap<>();

    //metodo para agregar en la lista las opciones de transición
    public TransicionSimple(){
        transiciones.put("A", "Rio");
        transiciones.put("B", "Laguna");
    }

    //metodo sobreescrito para cambiar la escena
    @Override
    public void cambiarEscena(String escenaActual, String nuevaEscena){
        System.out.println("Cambio de escena de: " + escenaActual + " a " + nuevaEscena + "........" );
    }

    //metodo sobreescrito para la siguiente escena
    @Override
    public String siguienteEscena(String decisionJugador){
        return transiciones.getOrDefault(decisionJugador, "Camino principal");
    }
}
