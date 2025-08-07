public class ex6 {
	
	private Double raio;
	
	public ex6(Double raio) {
		setRaio(raio);
	}
	
	public Double getRaio() {
		return raio;
	}
	public void setRaio(Double raio) {
		if (raio <= 0.0) {
			throw new IllegalArgumentException("O raio deve ser maior que zero");
		}
		this.raio = raio;
	}
	
	public void exibirRaio() {
		System.out.println("Raio: " + raio);
	}
	
	public void calcularArea() {
		double area = Math.PI * raio * raio;
		System.out.println("Area: " + area);
	}
	
	public static void main(String[] args) {
		ex6 raio = new ex6(0.0);
		raio.exibirRaio();
		raio.calcularArea();
	}

}
