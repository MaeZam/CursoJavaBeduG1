public class Ambulancia extends UnidadEmergencia{
    //atributos
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //constructor
    public Ambulancia(String nombreOperador){

        //inicializacion de los componentes
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    //sobreescrutra del metodo responder
    @Override
    public void responder(){
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.");
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
