//importación de la clase Scanner para leer datos desde la consola
import java.util.Scanner;
public class Paciente {

    //Atributos de los pacientes
    String nombre;
    int edad;
    String nroExpediente;

    //método para almancenar los datos:
    public void guardarDatos(){
        //instancia para crear un objeto scanner para almacenar los datos del paciente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los datos del paciente:");

        System.out.print("Nombre: ");
        nombre = scanner.nextLine(); //Este es un scanner para leer datos tipo String

        System.out.print("Edad: ");
        edad = scanner.nextInt(); //Este es un scanner para leer datos tipo int (valor numerico)
        scanner.nextLine(); // para el salto de línea y se limpie el buffer

        System.out.print("Número de expediente: ");
        nroExpediente = scanner.nextLine();

        scanner.close(); // ayuda a cerrar el  scanner y evitar haya alguna filtración
        //buffer --- espacio en la memoria, es el punto intermedio en la comunicación
    }
    //método público para almacenar los datos del paciente
    public void mostrarInformacion(){
        System.out.println("Datos del paciente: \nNombre: " + nombre + "\nEdad:" + edad + "\nNúmero de Expediente:" + nroExpediente);
    }

}
