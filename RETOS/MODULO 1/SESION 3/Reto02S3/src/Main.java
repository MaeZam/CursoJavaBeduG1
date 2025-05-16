public class Main {
    public static void main(String[] args) {
        //con rfc
        Factura f1 = new Factura(2500.00, "Servicio de Consultoria", "ABCC010101XYZ");
        System.out.println(f1.getResume());
        //sin rfc
        Factura f2 = new Factura(1800.0, "Reparación de equipo", null);
        System.out.println(f2.getResume());
    }
}