import java.util.LinkedHashSet;

public class ex15 {

    public static void main(String[] args) {
        
        LinkedHashSet<String> diasSemanas = new LinkedHashSet<String>();
        
        diasSemanas.add("Quarta-feira");
        diasSemanas.add("Domingo");
        diasSemanas.add("Sexta-feira");
        diasSemanas.add("Segunda-feira");
        diasSemanas.add("Sabado");
        diasSemanas.add("Terca-feira");
        diasSemanas.add("Quinta-feira");
        

        for(String dia : diasSemanas) {
            System.out.println(dia);
        }


    }
    
}
