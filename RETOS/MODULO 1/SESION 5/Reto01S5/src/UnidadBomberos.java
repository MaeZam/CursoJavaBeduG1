public class UnidadBomberos extends UnidadEmergencia {
    //atributos
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    //constructor
    public UnidadBomberos(String nombreOperador){
        //inicializacion de los componentes
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    //sobreescrutra del metodo responder
    @Override
    public void responder(){
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.");
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
