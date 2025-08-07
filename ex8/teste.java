package ex8;

public class teste {
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria("Gabriel", 10000.0);
		conta.contaInfo();
		
		try {
			conta.sacar(15000.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}

}
