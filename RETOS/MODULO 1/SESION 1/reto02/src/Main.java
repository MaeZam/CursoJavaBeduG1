public class Main {
    public static void main(String[] args) {

        Entrada entrada1 = new Entrada("Obra de teatro", 155.20);
        Entrada entrada2 = new Entrada("Danza Folcklorica", 370.25);

        //entrada1.guardarDatos();
        entrada1.mostrarInformacion();

        //entrada2.guardarDatos();
        entrada2.mostrarInformacion();

        //Uso del record
        Entrada_Record entradaRecord = new Entrada_Record("Obra de teatro", 255.23);
        System.out.println(entradaRecord);



    }
}