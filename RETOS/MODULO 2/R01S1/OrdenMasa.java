public class OrdenMasa extends OrdenProduccion {
    public OrdenMasa(String codigo, int cantidad) {
        super(codigo, cantidad);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Orden en Masa - Código: " + getCodigo() + " - Cantidad: " + getCantidad());
    }
}