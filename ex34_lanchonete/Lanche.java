package ex34_lanchonete;

import java.time.format.DateTimeFormatter;

public class Lanche extends Prato {

    protected String pao;
    protected String recheio;
    protected String molho;

    public Lanche(String pao, String recheio, String molho) {
        this.pao = pao;
        this.recheio = recheio;
        this.molho = molho;
    }


    @Override
    public void calcularPreco() {
        Double basePrice = 5.0;
        if (recheio != null && !recheio.isEmpty()) {
            basePrice += 2.0;
        }
        if (molho != null && !molho.isEmpty()) {
            if(molho == "nenhum") {
                basePrice += 0.0; 
            } else {
                basePrice += 1.0;
            }
        }
        this.preco = basePrice;
    }

    @Override
    public String toString() {
        calcularPreco();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String infoBase = String.format("Validade: %s, Peso: %.3f kg", 
                                        this.dataDeValidade.format(formatador), 
                                        this.peso = 0.2);

        // Retorna uma descrição completa do item, incluindo o preço
        return String.format("Pizza: {pao='%s', recheio='%s', molho='%s', preco=R$%.2f} [%s]", 
                             pao, recheio, molho, getPreco(), infoBase);
    }
    
}
