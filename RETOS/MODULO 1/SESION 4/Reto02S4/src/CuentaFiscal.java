import java.util.Objects;
public class CuentaFiscal {
    //Aplicación de Encapsulación
    //Atributos privados
    private final String rfc; //inmutable
    private double saldoDisponible;

    //Constructor con validacción para evitar el saldo negativo
    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        if (saldoDisponible > 0) {
            this.saldoDisponible = saldoDisponible;
        }else {
            System.out.println("El saldo debe ser mayo a cero");
        }
    }

    //GETTER PARA RFC
    public String getRfc(){
        return rfc;
    }
    //GETTER PARA SALDO DISPONIBLE
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    //metodo para comparar el RFC con el de declaracion usando Objects.equals()
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj != null || getClass() != obj.getClass()) return false;

        CuentaFiscal otro = (CuentaFiscal)obj;
        return this.rfc.equals(otro.rfc);
    }
    //metodo para mostrar la informacion
    @Override
    public String toString(){
        return "Cuenta Fiscal" +
                "RFC: " + rfc +
                "Saldo disponible: " + saldoDisponible ;
    }

}
