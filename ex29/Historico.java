package ex29;

import java.util.Scanner;
import java.util.LinkedList;

public class Historico {
    LinkedList<String> historico = new LinkedList<>();
    int indice = -1;

    
    public void visitar(String url) {
        historico.add(url);
        indice++;
    }

    public void voltar() {
        if(indice > 0) {
            indice--;
            System.out.println("Voltando para: " + historico.get(indice));
        } else {
            System.out.println("Nao ha paginas anteriores.");
        }
        
    }

    public void avancar() {
        if(indice < historico.size() - 1) {
            indice++;
            System.out.println("Avancando para: " + historico.get(indice));
        } else {
            System.out.println("Nao ha paginas posteriores.");
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Historico navegador = new Historico();
        String url;

        int opcao = -1;

        while(opcao != 0){
            System.out.println("0 - Sair");
            System.out.println("1 - Visitar nova URL");
            System.out.println("2 - Voltar");
            System.out.println("3 - Avancar");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch(opcao) {
                case 1:
                    System.out.println("Digite uma URL para visitar:");
                    url = scanner.nextLine();
                    navegador.visitar(url);
                    break;
                case 2:
                    navegador.voltar();
                    break;
                case 3:
                    navegador.avancar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }

        scanner.close();
    }
    
}
