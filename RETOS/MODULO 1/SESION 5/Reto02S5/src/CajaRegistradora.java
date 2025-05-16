
public class CajaRegistradora {
    public static void main(String[] args) {
        //arreglo para  guardar los metodos
        MetodoPago[] pagos = {
                new PagoEfectivo(150),
                new PagoTarjeta(320,320),
                new PagoTransferencia(320,100)
        };

        for (MetodoPago pago : pagos){
            if (pago.autenticar()){
                System.out.println("✅ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            }else {
                System.out.println("❌ Fallo de autenticación. Transferencia no válida.");
            }
            System.out.println();
        }


    }
}