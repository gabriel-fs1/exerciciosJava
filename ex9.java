import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ex9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        List<String> tarefas = new ArrayList<String>();

        while(opcao != 0){
            
        System.out.println("O que deseja fazer?:");
        System.out.println("0 - Sair");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Remover tarefa");
        System.out.println("3 - Listar tarefas\n");

        opcao = scanner.nextInt();
        scanner.nextLine(); 

        switch(opcao) {
            case 1:
                System.out.println("Digite a tarefa:");
                String item = scanner.nextLine();
                tarefas.add(item);
                System.out.println("Item adicionado!\n");
                break;
            case 2:
                if (tarefas.isEmpty()) {
                        System.out.println("Lista vazia!\n");
                    } else {
                        System.out.println("Digite o número da tarefa para remover:");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        if (num >= 1 && num <= tarefas.size()) {
                            tarefas.remove(num - 1);
                            System.out.println("Item removido!\n");
                        } else {
                            System.out.println("Número inválido!\n");
                        }
                    }
                    break;
            case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("\n--- Lista de Tarefas ---");
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                        System.out.println("------------------------\n" );
                    }
                break;
                case 0:
            System.out.println("Saindo...");
            break;

        default:
            System.out.println("Opção inválida!");
       }
                
        

    
    }
        scanner.close();
       
    }
    
}
        
