package ex7;

public class Carro extends Veiculo {
	
	private int numeroDePortas;
	
	public Carro(String marca, String modelo, int numeroDePortas) {
		super(marca, modelo);
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	public String toString() {
		return String.format("carro [marca: %s, modelo: %s, numeroDePortas: %d]", getMarca(), getModelo(), getNumeroDePortas());
	}
	
}
