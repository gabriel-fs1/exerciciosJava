import java.util.LinkedList;
import java.util.Queue;

public class ex24 {
    public static void main(String[] args) {
        
        Queue<String> filaImpressao = new LinkedList<>();

        filaImpressao.add("Documento1.pdf");
        filaImpressao.add("Foto.png");
        filaImpressao.add("Relatorio.docx");
        filaImpressao.add("TCC.pdf");
        filaImpressao.add("Planilha.xlsx");
        
        System.out.println("=== Fila de Impressão ===");
        System.out.println(filaImpressao);

        System.out.println("\n=== Iniciando Impressão ===");
        while (!filaImpressao.isEmpty()) {
            String documento = filaImpressao.poll(); 
            System.out.println("Imprimindo: " + documento);
        }
        
        System.out.println("\nFila vazia? " + filaImpressao.isEmpty());
    }
}
