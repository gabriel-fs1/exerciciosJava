import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Deque<String> pilhaLivros = new ArrayDeque<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o nome do livro " + i + ": ");
            String livro = scanner.nextLine();
            pilhaLivros.push(livro);
        }
        
        System.out.println("\nPilha de livros: " + pilhaLivros);

        String removido = pilhaLivros.pop();
        System.out.println("\nLivro removido (pop): " + removido);

        String topo = pilhaLivros.peek(); 
        System.out.println("Livro no topo (peek): " + topo);
        
        System.out.println("\nPilha final: " + pilhaLivros);
        
        scanner.close();
    }
}
