import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MainNarrativa {
    private TransicionHistoria transicion;
    private GestorDialogo dialogo;
    private LogicaDecision decision;

    // Inyección de dependencias por constructor
    public MainNarrativa(TransicionHistoria transicion,
                         GestorDialogo dialogo,
                         LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void iniciarEscena() {
        String escenaActual = "Cruce de caminos";

        dialogo.mostrarNarracion("Te encuentras en un cruce de caminos. Un sendero va hacia la izquierda y otro hacia la derecha.");
        dialogo.ensenarDialogo("Guía", "Debes elegir un camino para continuar tu aventura.");

        // Mostrar opciones disponibles
        System.out.println("\nOpciones disponibles:");

        for (String opcion : decision.obtenerOpcionesDisponibles()) {
            System.out.println("- " + opcion);
        }

        // Simulación de entrada del jugador
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n¿Qué camino eliges? ");
        String eleccionJugador = scanner.nextLine();

        // Procesar la decisión
        String decisionProcesada = decision.procesarDecision(eleccionJugador);
        String nuevaEscena = transicion.siguienteEscena(decisionProcesada);

        // Realizar la transición
        transicion.cambiarEscena(escenaActual, nuevaEscena);

        // Mostrar resultado
        dialogo.mostrarNarracion("Has elegido el camino hacia " + nuevaEscena + ".");
        if (nuevaEscena.equals("Bosque")) {
            dialogo.ensenarDialogo("Guardabosques", "Bienvenido al bosque encantado, viajero.");
        } else if (nuevaEscena.equals("Montaña")) {
            dialogo.ensenarDialogo("Montañero", "Las montañas son peligrosas esta época del año.");
        } else {
            dialogo.ensenarDialogo("Guía", "Parece que has elegido quedarte en el camino principal.");
        }
    }

    public static void main(String[] args) {
        // Crear implementaciones concretas
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        // Crear el sistema principal con inyección de dependencias
        MainNarrativa juego = new MainNarrativa(transicion, dialogo, decision);

        // Iniciar la escena
        juego.iniciarEscena();
    }
}
