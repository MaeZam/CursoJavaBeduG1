public abstract class UnidadEmergencia {

    //Atributos
    private String nombre;
    //método abstracto
    public abstract void responder();
    //metodo concreto
    public void activarUnidad(){
        System.out.println("🚨 Activando unidad: ");
    }
}
