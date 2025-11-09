package heranca.polimorfismo.interfaces.ex6;

abstract class OperacaoBancaria implements AcaoBancaria{
    private double valor;

    public OperacaoBancaria(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }
}
