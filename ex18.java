import java.util.HashMap;
import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> linguagem = new HashMap<>();

        linguagem.put("Ola", "Hello");
        linguagem.put("Mundo", "World");
        linguagem.put("Boa noite", "Good evening");
        linguagem.put("Bom dia", "Good morning");
        linguagem.put("Boa tarde", "Good afternoon");

        System.out.println("Digite uma frase em português:");
        String frase = scanner.nextLine();


        String traducaoFrase = linguagem.get(frase);
        if (traducaoFrase != null) {
            System.out.println("A tradução é: " + traducaoFrase);
        } else {
            
            String[] palavras = frase.split(" ");
            System.out.print("A tradução é: ");
            for (String palavra : palavras) {
                String traducao = linguagem.get(palavra);
                if (traducao != null) {
                    System.out.print(traducao + " ");
                } else {
                    System.out.print("[" + palavra + " (sem tradução)] ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
    
}
