import java.util.Scanner;


public class ex2 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a tabuada: ");
		int tabuada = leitor.nextInt();
		
		for(int i = 0; i<=10; i++) {
			
			int resultado = tabuada * i;
			
			System.out.println(tabuada + " x " + i + " = " + resultado);
			
		}
		
		leitor.close();
		
	}
}