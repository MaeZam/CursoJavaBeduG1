public class PagoTarjeta extends MetodoPago{

    //atributo
    private double saldo;
    //constructor
    public PagoTarjeta(double monto, double saldo){
        super(monto); //se manda a llamar el atributo desde la super clase con el constructor
        this.saldo = saldo;
    }

    //sobreescritura del metodo
    @Override
    public boolean autenticar(){
        //evaluando que haya dinero en la tarjeta
        return saldo >= monto ? true : false; // no requiere autenticacion
    }

    //sobreescribir el metodo
    public void procesarPago(){
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
