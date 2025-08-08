import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class ex13 {

    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(2);
        numeros.add(6);
        numeros.add(1);
        numeros.add(8);
        numeros.add(9);
        numeros.add(4);
        
        System.out.println("Lista original: " + numeros);

        HashSet<Integer> numerosUnicos = new HashSet<Integer>(numeros);
        System.out.println("\nLista sem duplicatas: " + numerosUnicos);

    }
    
}
