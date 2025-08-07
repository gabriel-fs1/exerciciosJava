import java.util.Scanner;

public class ex3{
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int random = (int)(Math.random() * 100) + 1;
		int n = -1;
		int tentativas = 0;
		
		  System.out.println("Adivinhe o número entre 1 e 100!");
		while(n != random) {
			System.out.println("Digite seu palpite: ");
			n = leitor.nextInt();
			tentativas++;
			
			 if (n == random) {
	                break;
	            }
			
			 if (n < random) {
	                int diferenca = random - n;

	                if (diferenca <= 10) {
	                    System.out.println("Quase lá! Um pouco mais alto.");
	                } else if (diferenca <= 20) {
	                    System.out.println("Está relativamente longe... tente mais alto.");
	                } else {
	                    System.out.println("Muito baixo!");
	                }
	            } else {
	                int diferenca = n - random;

	                if (diferenca <= 10) {
	                    System.out.println("Quase lá! Um pouco mais baixo.");
	                } else if (diferenca <= 20) {
	                    System.out.println("Está relativamente longe... tente mais baixo.");
	                } else {
	                    System.out.println("Muito alto!");
	                }
	            }
	        }
		
		 System.out.println("Parabéns! Você acertou o número " + random + "!");
	     System.out.println("Número de tentativas: " + tentativas);
		
		leitor.close();
		
	}
}