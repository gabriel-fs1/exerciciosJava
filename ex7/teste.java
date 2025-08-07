package ex7;

public class teste {
	public static void main(String[] args) {
		
		Carro carro = new Carro("Toyota", "Corolla", 6);
		System.out.println(carro.toString());
		
		Moto moto =  new Moto("Honda", "Civic", 150.0);
		System.out.println(moto.toString()); 
		
	}
}