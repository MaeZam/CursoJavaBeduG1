package cajeroAut;
import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        double saldoi = 1000;
        int op;

        do {
            //bienvenida
            System.out.println("Bienvenido al ATM, selecciona una opción:");
            //menu del atm
            System.out.println("1. Consultar saldo \n 2. Depositar dinero \n 3. Retirar dinero \n 4. Salir");
            //lectura de la opcion
            op = opcion.nextInt();
            opcion.nextLine();


            //Uso de switch para ejecutar las opciones
            switch (op){
                case 1 -> {
                    System.out.println("Saldo inicial: " + saldoi);
                    break;
                }
                case 2 ->{
                    System.out.println("Ingresa la cantidad a depositar: ");
                    double deposito = opcion.nextDouble();
                    opcion.nextLine();
                    if (deposito <= 0) {
                        System.out.println("El monto debe ser mayor a cero.");
                        continue;
                    }
                    saldoi = saldoi + deposito;
                    System.out.println("Se realizó el depósito, saldo actual: " + saldoi);
                    break;
                }
                case 3 ->{
                    System.out.println("Ingresa el monto a retirar:");
                    double retirar = opcion.nextDouble();
                    opcion.nextLine();
                    if(retirar > saldoi){
                        System.out.println("Fondos insuficientes. Saldo actual: " + saldoi);
                        continue;
                    } else if (retirar < 0) {
                        System.out.println("Monto invalido, vuelve a intentarlo");
                        continue;
                    }

                    saldoi -= retirar;
                    System.out.println("Retiro Exitoso, saldo actual: " + saldoi);
                    break;
                }
                case 4 -> {
                    System.out.println("Gracias por usar nuestro servicio, ¡Hasta Pronto!");
                    break;
                }
                default -> {
                    System.out.println("Opción invalida, vuelve a intentarlo con las opciones indicadas.");
                    continue;
                }
            }
        }while (op != 4);
        opcion.close();
    }
}