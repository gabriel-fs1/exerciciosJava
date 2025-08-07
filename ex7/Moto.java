package ex7;

public class Moto extends Veiculo {
	
	private Double cilindradas;
	
	public Moto(String marca, String modelo, Double cilindradas) {
		super(marca, modelo);
		this.cilindradas = cilindradas;
	}

	public Double getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(Double cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public String toString() {
		return String.format("Moto [marca: %s, modelo: %s, cilindradas: %s]", getMarca(), getModelo(), getCilindradas());
	}

}