package reservasVuelo;

public class Main {
    public static void main(String[] args) {
        //creación de objetos de vuelo y pasajero
        Vuelo vuelo1 = new Vuelo("UX123", "Paris", "14:30");
        Pasajero pasajero1 = new Pasajero("Ana Martinez", "P1123456");

        //USO DE LOS MÉTODOS DE LAS CLASES VUELO Y PASAJERO
        //RERSERVAR ASIENTO
        vuelo1.reservarAsiento(pasajero1);
        //MOSTRAR ITINERARIO
        System.out.println(vuelo1.obtenerItinerario());
        //CANCELAR RESERVA
        vuelo1.cancelarReserva();
        //MOSTRAR ITINERARIO MODDIFICADO
        System.out.println(vuelo1.obtenerItinerario());
        //RESERVAR CON EL MÉTODO SOBRECARGADO
        vuelo1.reservarAsiento("Mario Gonzalez", "P987654");
        //ITINERARIO ACTUALIZADO
        System.out.println(vuelo1.obtenerItinerario());

    }
}