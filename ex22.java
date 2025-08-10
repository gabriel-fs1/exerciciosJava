import java.util.TreeMap;

public class ex22 {
    public static void main(String[] args) {

        TreeMap<String, Double> notas = new TreeMap<>();

        notas.put("Carlos", 9.5);
        notas.put("Davi", 6.0);
        notas.put("Ana", 8.5);
        notas.put("Bruno", 7.0);
        notas.put("Eduardo", 8.0);

        for (String aluno : notas.keySet()) {
            System.out.println(aluno + ": " + notas.get(aluno));
        }

        
    }
    
}
