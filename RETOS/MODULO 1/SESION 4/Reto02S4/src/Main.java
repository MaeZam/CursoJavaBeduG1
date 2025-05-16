
public class Main {
    public static void main(String[] args) {

        //Creacion de los objetos:
        DeclaracioImpuestos declaracion = new DeclaracioImpuestos("XAXX010101000", 8700);
        CuentaFiscal fiscal = new CuentaFiscal("XAXX010101000", 9500);

        //Informacion
        System.out.println("Declaracion enviada por RFC: " + declaracion.rfcContribuyente() + "por" + declaracion.montoDeclarado());
        System.out.println("Cuenta fiscal registrada con RFC: " + fiscal.getRfc() + ", saldo disponible: " + fiscal.getSaldoDisponible() );

        //Comparación del RFC
        System.out.println("¿RFC válido para esta cuenta?: " + declaracion.rfcContribuyente().equals(fiscal.getRfc()));

    }
}