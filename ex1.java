import java.util.Scanner;


public class ex1 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		Double n1 = leitor.nextDouble();
		
		System.out.println("Segunda nota: ");
		Double n2 = leitor.nextDouble();
		
		System.out.println("Terceira nota: ");
		Double n3 = leitor.nextDouble();
		
		Double media = (n1+n2+n3)/3;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}else if(media >= 5 && media < 7) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		System.out.println("Media: " + media);
		
		leitor.close();
		
	}
}