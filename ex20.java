import java.util.HashMap;
import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("diogo", "1199999-9999");
        agenda.put("joao", "1198888-8888");
        agenda.put("maria", "1197777-7777");
        agenda.put("jose", "1196666-6666");

        int opcao = -1;

        while(opcao != 0) {

            System.out.println("O que deseja fazer?:");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Procurar contato");
            System.out.println("3 - Listar contatos\n");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch(opcao) {
                case 0:
                    System.out.println("Saindo...");
                break;
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    String telefone = scanner.nextLine();
                    agenda.put(nome, telefone);
                    System.out.println("Contato adicionado!\n");
                break;
                case 2:
                    System.out.println("Digite o nome do contato que deseja procurar:");
                    String procurar = scanner.nextLine();
                    String telefoneEncontrado = agenda.get(procurar);
                    if (telefoneEncontrado != null) {
                        System.out.println("Telefone de " + procurar + ": " + telefoneEncontrado + "\n");
                    } else {
                        System.out.println("Contato não encontrado!\n");
                    }    
                break;
                case 3:
                    System.out.println("Contatos:");
                    for (String contato : agenda.keySet()) {
                        System.out.println(contato + ": " + agenda.get(contato));
                    }
                    System.out.println("\n");
                break;
                default:
                    System.out.println("Opção inválida!\n");
                break;
            }

        }


        scanner.close();
        
    }
}
