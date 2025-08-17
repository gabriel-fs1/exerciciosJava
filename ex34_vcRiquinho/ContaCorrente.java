package ex34_vcRiquinho;

public class ContaCorrente extends Contas {


    public ContaCorrente(Double saldo, Cliente donoDaConta) {
        super(saldo, donoDaConta);
    }

    
    @Override
    public Double calcularRendimento(int periodoEmDias) {
        // Conta Corrente não gera rendimento, então retorna 0.0
        return 0.0;
    }
    
}
