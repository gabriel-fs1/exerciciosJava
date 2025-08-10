package ex26;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco;
    }

    public static void main(String[] args) {
        Map<String, List<Produto>> catalogo = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        catalogo.put("Eletrônicos", Arrays.asList(
            new Produto("Smartphone", 1999.99),
            new Produto("Notebook", 4999.99),
            new Produto("Tablet", 899.99)
        ));

        catalogo.put("Vídeo Games", Arrays.asList(
            new Produto("PS5", 4999.99),
            new Produto("Xbox Series X", 4999.99),
            new Produto("Nintendo Switch", 2999.99)
        ));

        catalogo.put("Acessórios", Arrays.asList(
            new Produto("Fone de Ouvido", 199.99),
            new Produto("Carregador Portátil", 149.99),
            new Produto("Capa de Celular", 49.99)
        ));

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("O que deseja fazer?:");
            System.out.println("0 - Sair");
            System.out.println("1 - Listar Eletrônicos");
            System.out.println("2 - Listar Vídeo Games");
            System.out.println("3 - Listar Acessórios");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("\nLista de Eletrônicos:");
                    for (Produto produto : catalogo.get("Eletrônicos")) {
                        System.out.println(produto);
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\nLista de Vídeo Games:");
                    for (Produto produto : catalogo.get("Vídeo Games")) {
                        System.out.println(produto);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\nLista de Acessórios:");
                    for (Produto produto : catalogo.get("Acessórios")) {
                        System.out.println(produto);
                    }
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }


        
    }
    scanner.close();
}
}
