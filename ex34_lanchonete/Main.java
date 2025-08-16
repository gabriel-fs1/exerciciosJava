package ex34_lanchonete;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Prato> itensConsumidos = new ArrayList<>();
        System.out.println("Bem-vindo à Lanchonete!");
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.printf("==========================%n");
        
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Olá, " + nomeCliente + "! O que deseja fazer?:");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar item ao pedido");
            System.out.println("2 - Finalizar pedido");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.printf("\n");
            
            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Escolha o tipo de prato:");
                    System.out.println("1 - Lanche");
                    System.out.println("2 - Pizza");
                    System.out.println("3 - Salgadinho");
                    
                    int tipoPrato = scanner.nextInt();
                    scanner.nextLine();
                    System.out.printf("\n");
                    switch (tipoPrato) {
                        case 1:
                            System.out.print("Digite o tipo de pão*: ");
                            String pao = scanner.nextLine();
                            System.out.print("Digite o recheio*: ");
                            String recheio = scanner.nextLine();
                            System.out.print("Digite o molho*: ");
                            String molho = scanner.nextLine();
                            Prato lanche = new Lanche(pao, recheio, molho);
                            itensConsumidos.add(lanche);
                            System.out.printf("\n");
                            break;
                        case 2:
                            System.out.print("Digite o tipo de molho: ");
                            String molhoPizza = scanner.nextLine();
                            System.out.print("Digite o recheio: ");
                            String recheioPizza = scanner.nextLine();
                            System.out.print("Digite a borda(sim ou não): ");
                            String bordaPizza = scanner.nextLine();
                            Prato pizza = new Pizza(molhoPizza, recheioPizza, bordaPizza);
                            itensConsumidos.add(pizza);
                            System.out.printf("\n");
                            break;
                        case 3:
                            System.out.print("Digite o recheio: ");
                            String recheioSalgadinho = scanner.nextLine();
                            System.out.print("Digite o tipo (frito ou assado): ");
                            String massaSalgadinho = scanner.nextLine();
                            Prato salgadinho = new Salgadinho(recheioSalgadinho, massaSalgadinho);
                            itensConsumidos.add(salgadinho);
                            System.out.printf("\n");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            System.out.printf("\n");
                    }
                    break;
                case 2:
                    System.out.println("Finalizando pedido...");
                    Pedido pedido = new Pedido(nomeCliente, itensConsumidos);
                    System.out.println("Nota fiscal gerada para o cliente: " + nomeCliente);
                    System.out.printf("\n");
                    pedido.mostrarFatura();
                    opcao = 0;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        
        
        System.out.printf("\n");
        System.out.println("Pedido criado com sucesso para " + nomeCliente);
        scanner.close();
        
    }
}
