import java.util.Objects;
public class Factura {

    //Atributos
    private String folio;
    public String cliente;
    public double total;

    //Constructor con Parametros:
   public Factura(String folio, String cliente, Double total){
       this.folio = folio;
       this.cliente =cliente;
       this.total = total;
   }

   //comparacion con el metodo sobreescrito de equals
   @Override
    public boolean equals(Object obj){
       if (this == obj) return true;
       if (obj == null || getClass() != obj.getClass()) return false;

       Factura otra =  (Factura) obj;
       return this.folio.equals(otra.folio);
   }
   //metodo de comparacion de hashcode sobreescrito para comparar el valior folio
   @Override
   public int hashCode(){
       return Objects.hash(folio); //solo ocupamos comparar este atributo
   }

    //metodo sobreescrito de tostring para mostrar los datos de la factura
   @Override
    public String toString(){
       return "Factura: [" +
               "\nFolio: " + folio +
               "\nCliente: " + cliente +
               "\nTotal: $"+ total + "]";
   }
}
