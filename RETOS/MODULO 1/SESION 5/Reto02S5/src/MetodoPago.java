public abstract class MetodoPago implements Autenticable {
    //atributo
    protected double monto;
    //constructor
    public MetodoPago(double monto){
        this.monto = monto;
    }

    //metodo absttracto
    public abstract void procesarPago();

    //metodo concreto
    public void mostrarResumen(){
        System.out.println("📄Tipo " + this.getClass().getSimpleName() + "- Monto: $" + monto);
    }

}
