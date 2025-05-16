public class Patrulla extends UnidadEmergencia{
    //atributos
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //constructor
    public Patrulla(String nombreOperador){
        //inicializacion de los componentes
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    //sobreescrutra del metodo responder
    @Override
    public void responder(){
        System.out.println(" 🚓 Patrulla atendiendo situación de seguridad ciudadana.");
    }

    //método para invocar cada metodo
    public void iniciarOperacion(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
