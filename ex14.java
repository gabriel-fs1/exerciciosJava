import java.util.HashSet;

public class ex14 {

    public static void main(String[] args) {
        
        HashSet<String> emails = new HashSet<String>();
        
        emails.add("blabla@email.com");
        emails.add("gabriel@email.com");
        emails.add("joao@email.com");
        emails.add("maria@email.com");
        emails.add("joao@email.com");

        System.out.println("\nLista de emails: " + emails);
        System.out.println("Tamanho da lista de emails: " + emails.size());

    }
    
}
