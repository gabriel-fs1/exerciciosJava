package ex34_vcRiquinho;

public class ContaCDI extends Contas implements Tributavel{

    private Double taxaCDI; // Taxa CDI aplicada à conta

    public ContaCDI(Double saldo, Cliente donoDaConta, Double taxaCDI) {
        super(saldo, donoDaConta);
        this.taxaCDI = taxaCDI;
    }

    @Override
    public Double calcularRendimento(int periodoEmDias) {
        return 0.0;
    }

    @Override
    public double calcularTaxaServico(double rendimentoBruto) {
        return 0.0;
    }
    
}
