package ex8;

public class ContaBancaria {
	
    private String titular;
    private double saldo;
    
    
	public ContaBancaria( String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void contaInfo() {
		System.out.println("Titular: " + titular + ". Saldo: " + saldo);
	}

	public void sacar(Double valor) throws SaldoInsuficienteException{
		if(valor > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		saldo -= valor;
		System.out.println("Saque bem sucedido " + titular + ". Saldo atual: " + saldo);
	}
	

	
}
