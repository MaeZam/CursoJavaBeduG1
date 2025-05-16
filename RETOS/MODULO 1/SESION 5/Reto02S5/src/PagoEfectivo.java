public class PagoEfectivo extends MetodoPago{

    //constructor
    public PagoEfectivo(double monto){
        super(monto); //se manda a llamar el atributo desde la super clase con el constructor
    }

    //sobreescritura del metodo
    @Override
    public boolean autenticar(){
        return true; // no requiere autenticacion
    }

    //sobreescribir el metodo
    public void procesarPago(){
        System.out.println("💵 Procesando pago en efectivo por $" + monto);
    }
}
