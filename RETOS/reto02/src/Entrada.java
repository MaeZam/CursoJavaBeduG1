import java.util.Scanner;
public class Entrada {

    String evento;
    Double precio;

    public Entrada(String evento, Double precio){
        this.evento = evento;
        this.precio = precio;
    }

    /*
    public void guardarDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el nombre del evento: ");
        evento = scanner.nextLine();

        System.out.println("Ingresar el precio del evento:");
        precio = scanner.nextDouble();
    }
    */

    public void mostrarInformacion(){
        System.out.println("Evento: " + evento + "Precio: " + precio);
    }

}
