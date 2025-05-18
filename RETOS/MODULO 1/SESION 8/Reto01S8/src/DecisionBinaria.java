import java.awt.*;
import java.util.Arrays;

public class DecisionBinaria implements LogicaDecision {
    //sobreescritura de los metodos
    @Override
    public String procesarDecision(String decisionJugador) {
        return decisionJugador.toLowerCase();
    }

    @Override
    public String[] obtenerOpcionesDisponibles() {
        return new String[]{"A", "B"};
    }
}
