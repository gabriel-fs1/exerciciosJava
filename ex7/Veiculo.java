package ex7;

public class Veiculo {
	
	protected String marca;
	protected String modelo;

	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return String.format("veiculo [marca: %s, modelo: %s]", getMarca(), getModelo());
	}
	
}
