
public class Main {
    public static void main(String[] args) {

        char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        //System.out.println(alfabeto.length);
        int A = 27; //valor absoluto del alfabeto
        //Cifrado
        System.out.println("CIFRADO: ");
        char[] mensajeO = {'H','O','L','A'};
        System.out.println(mensajeO);
        var k = 5; //clave
        char [] cifrado = new char[4]; //arreglo para guardar el cifrado
        for (int i = 0; i< 4; i++){
            char letraActual = mensajeO[i];
            int M = -1;

            //busqueda de la posicion
            for (int j = 0; j< A; j++){
                if (alfabeto[j] == letraActual){
                    M = j;
                    break;
                }
            }

            //proceso del cifrado una vez encontrada la letra
            if (M != -1){
                int C = M + (k%A);
                cifrado[i] = alfabeto[C];
            }else{
                cifrado[i] = letraActual;
            }
        }
        System.out.print(cifrado); //resultado del cifrado

        System.out.println("\nDESCIFRADO:");

        char [] mensajeC = {'S','L', 'A'}; //palabra cifrada
        System.out.println(mensajeC);
        var K2 = 30; //clave
        char [] descifrado = new char[3]; //almacenamiento de la palabra
        //proceso descifrado
        for (int i = 0; i<3; i++){
            char letraActual = mensajeC[i];
            int C = -1;

            //
            for (int j = 0; j<A; j++){
                if (alfabeto[j] == letraActual){
                    C=j;
                    break;
                }
            }

            if (C != -1){
                int M = C - (K2 % A) ;
                if (M<0){
                    M+=A;
                }
                descifrado[i] = alfabeto[M];
            }
            else {
                descifrado[i] = letraActual;
            }
        }
        System.out.println(descifrado);

    }
}