package reservasVuelo;

public class Pasajero {
    //atributis
    private String nombre;
    private String pasaporte;

    //constructor
    public Pasajero(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }
    //método getter para el nombre
    public String getNombre(){
        return nombre;
    }
    //metodo getter para el pasaporte
    public String getPasaporte(){
        return pasaporte;
    }
}
