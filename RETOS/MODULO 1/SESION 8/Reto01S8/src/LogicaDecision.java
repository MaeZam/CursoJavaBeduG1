import java.awt.*;

//Gestión para manejar las decisiones del jugador
public interface LogicaDecision {
    String procesarDecision(String decisionJugador);
    String[] obtenerOpcionesDisponibles();// Debe devolver List<String>
}
