public class Main {
    public static void main(String[] args) {

        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.0 );
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        //Datos de las facturas:
        System.out.println("\nFactura 1: " + f1);
        System.out.println("\nFactura 2: " + f2);

        //Comparación con hashcode
        System.out.println("\nHash de la Factura 1 " + f1.hashCode());
        System.out.println("\nHash de la Factura 2 " + f2.hashCode());

        //comparación con equals()
        System.out.println("\n¿Los folios son iguales? " + f1.equals(f2));
    }
}