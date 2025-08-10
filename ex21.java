import java.util.LinkedHashMap;

public class ex21 {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> produtos = new LinkedHashMap<>();
        
        produtos.put("Arroz", 5);
        produtos.put("Cebola", 1);
        produtos.put("Feijão", 4);
        produtos.put("Alface", 2);
        produtos.put("Tomate", 3);


        for (String produto : produtos.keySet()) {
            System.out.println(produto + ": " + produtos.get(produto));
        }

    }
    
}
