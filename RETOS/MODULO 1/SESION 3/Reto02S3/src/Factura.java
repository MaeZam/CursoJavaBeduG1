import java.util.Optional;

public class Factura {
    //atributos privados
    private double monto;
    private String description;
    private Optional<String> rfc;

    //métodos públicos
    public Factura(double monto, String description, String rfc){
        this.monto = monto;
        this.description = description;
        this.rfc = ( rfc != null) ? Optional.of(rfc) : Optional.empty();
    }
    // detalle de la factura
    public String getResume(){
        return "\nFactura generada: \n" +
                "Descripcion: " + description +
                "\nMonto: " + monto +
                "\nRFC " + rfc.orElse("[No propocionado]");
    }
}