public class ex5 {

	private String marca;
	private String modelo;
	private int ano;
	
	public ex5(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
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

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void exibirInfo() {
		System.out.println("Marca:" + marca);
		System.out.println("modelo:" + modelo);
		System.out.println("ano:" + ano);
	}
	
	 public static void main(String[] args) {
	        ex5 meuCarro = new ex5("Toyota", "Corolla", 2020);
	        meuCarro.exibirInfo();
	    }
}
