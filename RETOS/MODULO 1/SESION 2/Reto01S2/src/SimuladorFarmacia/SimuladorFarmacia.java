package SimuladorFarmacia;

import java.util.Scanner;

public class SimuladorFarmacia {

    String nombreMedicamento;
    double precioUni;
    int cantPzs;

    //constructo
    /*public SimuladorFarmacia(String nombreMedicamento, double precioUni, int cantPzs){
        this.nombreMedicamento = nombreMedicamento;
        this.cantPzs = cantPzs;
        this.precioUni = precioUni;
    }*/

    //Registro de compra
    public void registrarCompra(){
        //instancia del objeto scanner
        Scanner compra = new Scanner(System.in);

        //Solicitud de los datos de la compra
        System.out.println("Ingresa los datos de la compra");

        System.out.println("Nombre del medicamento: ");
        nombreMedicamento = compra.nextLine();

        System.out.println("Cantidad: ");
        double cant = cantPzs;
        cantPzs = compra.nextInt();
        compra.nextLine();

        System.out.println("Precio unitario: ");
        precioUni = compra.nextDouble();
        compra.nextLine();

        compra.close();
    }

    public void mostrarInfo() {
        //Calculos de los totales y descuentos
        double total = cantPzs * precioUni;
        var Adesc = total > 500;
        double desc = Adesc ? total * 0.15 : 0;
        double totalF = total - desc;

        //Desglose de los resultados
        System.out.println("\nDatos de la compra:");
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantPzs);
        System.out.println("Precio Unitario: " + precioUni);
        System.out.println("Total sin descuento: " + total);
        System.out.println("¿Aplica Descuento? " + Adesc);
        System.out.println("Descuento: " + desc);
        System.out.println("Total a Pagar: " + totalF);
    }
}