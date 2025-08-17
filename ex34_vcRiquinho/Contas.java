package ex34_vcRiquinho;

public abstract class Contas{

    protected Double saldo;
    protected Cliente donoDaConta;

    public Contas(Double saldo, Cliente donoDaConta) {
        this.saldo = saldo;
        this.donoDaConta = donoDaConta;
    }

    public abstract Double calcularRendimento(int periodoEmDias);
    
}
