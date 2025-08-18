package ex34_vcRiquinho;

public class ContaCDI extends Contas implements Tributavel{

    private Double taxaCDI; // Taxa CDI aplicada à conta

     private double taxaCDIAnual = 0.1125;

    public ContaCDI(Cliente donoDaConta) {
        super(donoDaConta);
    }

    @Override 
    public double calcularRendimento(int dias) {
        double taxaCdiDiaria = taxaCDIAnual / 360.0;
        double rendimentoProjetado = this.getSaldo() * taxaCdiDiaria * dias;
        return rendimentoProjetado;
    }

    @Override
    public double calcularTaxaServico(double rendimentoBruto) {
        return rendimentoBruto * 0.0007;
    }

    @Override
    public String toString() {
        return "ContaCDI (" +
                "saldo: R$" + getSaldo() +
                ')';
    }
}
