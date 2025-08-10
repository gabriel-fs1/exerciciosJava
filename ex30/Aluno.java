package ex30;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Aluno {

    String nome;
    double nota;
    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return this.nome;
    }
    
    public double getNota() {
        return this.nota;
    }

    @Override
    public String toString() {
        return nome + " - " + nota;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Aluno>> status = new HashMap<>();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("O que deseja fazer?:");
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar Aluno e nota");
            System.out.println("2 - Listar Aprovados");
            System.out.println("3 - Listar Recuperação");
            System.out.println("4 - Listar Reprovados");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a nota do aluno:");
                    double nota = scanner.nextDouble();
                    scanner.nextLine();

                    String categoria;
                    if (nota >= 7.0) {
                        categoria = "Aprovados";
                    } else if (nota >= 5.0) {
                        categoria = "Recuperação";
                    } else {
                        categoria = "Reprovados";
                    }

                    List<Aluno> lista = status.get(categoria);
                    if (lista == null) {
                        lista = new java.util.ArrayList<>();
                        status.put(categoria, lista);
                    }
                    lista.add(new Aluno(nome, nota));
                    break;
                case 2:
                    System.out.println("\nAprovados:\n");
                    List<Aluno> aprovados = status.get("Aprovados");
                    if (aprovados != null) {
                        for (Aluno aluno : aprovados) {
                            System.out.println(aluno);
                        }
                        System.out.println("\n");
                    } else {
                        System.out.println("Nenhum aluno aprovado.\n");
                    }
                    break;
                case 3:
                    System.out.println("\nRecuperação:\n");
                    List<Aluno> recuperacao = status.get("Recuperação");
                    if (recuperacao != null) {
                        for (Aluno aluno : recuperacao) {
                            System.out.println(aluno);
                        }
                        System.out.println("\n");
                    } else {
                        System.out.println("Nenhum aluno em recuperação.\n");
                    }
                    break;
                case 4:
                    System.out.println("\nReprovados:\n");
                    List<Aluno> reprovados = status.get("Reprovados");
                    if (reprovados != null) {
                        for (Aluno aluno : reprovados) {
                            System.out.println(aluno);
                        }
                        System.out.println("\n");
                    } else {
                        System.out.println("Nenhum aluno reprovado.\n");
                    }
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }
        }

        scanner.close();
    }
}
