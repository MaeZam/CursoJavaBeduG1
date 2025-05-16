package reservasVuelo;

public class Vuelo {

    //atributos
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    //constructor
    public Vuelo(String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }
    //método que asigna al pasajero si no hay reserva previa
    public boolean reservarAsiento(Pasajero p){
        if (asientoReservado == null){
            asientoReservado = p;
            System.out.println("Se realizcó la reserva con éxito");
            return true;
        }
        else {
            System.out.println("El asiento se encuentra reservado");
            return false;
        }
    }
    //método sobrecargado
    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    //método para cancelar el asiento, es decir elimina al pasajero asignado
    public void cancelarReserva(){
        if (asientoReservado != null){
            System.out.println("Se ha cancelado la reserva");
            asientoReservado = null;
        }
        else {
            System.out.println("NO hay reservas para cencelar");
        }
    }
    //metodo para mostrar la información del itinerario
    public String obtenerItinerario(){
        String pasajeroInfo = (asientoReservado != null) ? asientoReservado.getNombre() : "[Sin reserva]";
        return "\n Itinerario del vuelo: " + "\nCódigo de vuelo: " + codigoVuelo
                + "\nDestino: " + destino +
                "\nSalida: " + horaSalida +
                "\nPasajero: " + pasajeroInfo;
    }



}
