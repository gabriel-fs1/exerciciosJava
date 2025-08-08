import java.util.TreeSet;

public class ex16 {

    public static void main(String[] args) {
        
        TreeSet<String> nomes = new TreeSet<String>();
        
        nomes.add("Davi");
        nomes.add("Anastacia");
        nomes.add("Fernanda");
        nomes.add("Gabriel");
        nomes.add("Ana");

        for(String nome : nomes) {
            System.out.println(nome);
        }

    }
    
}
