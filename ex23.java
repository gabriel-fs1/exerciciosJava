import java.util.HashMap;
import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("diogo", "1199999-9999");
        agenda.put("joao", "1198888-8888");
        agenda.put("maria", "1197777-7777");
        agenda.put("jose", "1196666-6666");

        String nome;
        String telefone;

        System.out.println("Digite o nome do contato:");
        nome = scanner.nextLine();
        System.out.println("Digite o telefone do contato:");
        telefone = scanner.nextLine();

        if (agenda.containsKey(nome) && agenda.containsValue(telefone)) {
            System.out.println("O contato já existe");
        } else {
            System.out.println("Contato nao encontrado.");
        }

        scanner.close();
        
    }
}
