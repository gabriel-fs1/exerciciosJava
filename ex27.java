import java.util.ArrayList;
import java.util.Random;

public class ex27 {
    public static void main(String[] args) {
        ArrayList<String> sorteados = new ArrayList<>();

        sorteados.add("Ana");
        sorteados.add("Beatriz");
        sorteados.add("Carlos");
        sorteados.add("Fernanda");
        sorteados.add("Eduardo");
        sorteados.add("Fernanda");
        sorteados.add("Gabriel");
        sorteados.add("Isabella");
        sorteados.add("Gabriel");
        sorteados.add("Ana");

        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int indexSorteado = random.nextInt(sorteados.size());
            String nomeSorteado = sorteados.get(indexSorteado);
            System.out.println("Nome sorteado: " + nomeSorteado + ", numero de sorteio: " + indexSorteado);
            nomeSorteado = sorteados.remove(indexSorteado);
        }


    }
}
