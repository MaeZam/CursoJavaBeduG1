public interface TransicionHistoria {
    //Metodos para definir las transiciones
    void cambiarEscena(String escenaActual, String nuevaEscena);
    String siguienteEscena(String decisionJugador);
}
