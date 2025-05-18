public class DialogoTexto implements GestorDialogo {
    //Metodos SobreEscritoe
    @Override
    public void ensenarDialogo(String personaje, String texto){
        System.out.println("Personaje: " + personaje + "Dialogo: \"" + texto +"\"");
    }

    @Override
    public void mostrarNarracion(String texto){
        System.out.println("Narrador: " + texto);
    }
}
