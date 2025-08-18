package ex34_vcRiquinho;

public class ContaCorrente extends Contas {


public ContaCorrente(Cliente donoDaConta) {
        super(donoDaConta);
    }

    @Override
    public double calcularRendimento(int dias) {
        double rendimentoBruto = 0;
        return rendimentoBruto; //conta corrente não tem rendimento tlgd
    }

    @Override
    public String toString() {
        return "ContaCorrente (" +
                "saldo: R$" + getSaldo() +
                ')';
    }
}
