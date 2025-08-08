import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<String> cidades = new ArrayList<String>();

        cidades.add("Sao Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Brasilia");
        cidades.add("Salvador");

        System.out.println("Digite o nome de uma cidade do Brasil (não use acentos): ");
        String cidade = scanner.nextLine();

        if(cidades.contains(cidade)){
            int index = cidades.indexOf(cidade);
            System.out.println("A cidade " + cidade + " está na lista e seu índice é: " + index);
        } else {
            System.out.println("A cidade " + cidade + " não está na lista.");
        }
        

        scanner.close();
    }
    
}
