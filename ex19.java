
import java.util.HashMap;


public class ex19 {
public static void main(String[] args) {
    HashMap<String, Integer> contagem = new HashMap<>();

    String frase = "Ola Mundo Boa noite Bom dia Boa tarde Ola ola Boa Bom";

    for (String palavra : frase.split(" ")) {
        if (contagem.containsKey(palavra)) {
            contagem.put(palavra, contagem.get(palavra) + 1);
        } else {
            contagem.put(palavra, 1);
        }
    }

    System.out.println("Contagem de palavras:");
    for (String palavra : contagem.keySet()) {
        System.out.println(palavra + ": " + contagem.get(palavra));
    }
}

}
