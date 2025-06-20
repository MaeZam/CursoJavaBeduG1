public class OrdenPrototipo extends OrdenProduccion {
    private final String faseDesarrollo;

    public OrdenPrototipo(String codigo, int cantidad, String faseDesarrollo) {
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    public String getFaseDesarrollo() { return faseDesarrollo; }

    @Override
    public void mostrarResumen() {
        System.out.println("Orden en Prototipo - Código: " + getCodigo() +
                " - Cantidad: " + getCantidad() +
                " - Etapa: " + faseDesarrollo);
    }
}