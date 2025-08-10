import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<String> frase = new ArrayDeque<>();

        System.out.println("Digite uma frase:");
        String entrada = scanner.nextLine();

        String[] palavras = entrada.split(" ");
        for (String palavra : palavras) {
            frase.push(palavra);
        }

        System.out.println("Frase invertida:");
        while (!frase.isEmpty()) {
            System.out.print(frase.pop() + " ");
        }


        scanner.close();
    }
    
}
