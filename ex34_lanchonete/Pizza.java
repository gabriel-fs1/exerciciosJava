package ex34_lanchonete;

import java.time.format.DateTimeFormatter;

public class Pizza extends Prato {

    protected String molho;
    protected String recheio;
    protected String borda;

    public Pizza(String molho, String recheio, String borda) {
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
    }

    @Override
    public void calcularPreco(){
        double basePrice = 60.0; 
        if (recheio != null && !recheio.isEmpty()) {
            basePrice += 2.0;
        }
        if (borda != null && borda.equalsIgnoreCase("sim")) {
            basePrice += 1.5;
        }
        if (molho != null && !molho.isEmpty()) {
            basePrice += 0.5; 
        }
       
        this.preco = basePrice;

    }
    
    @Override
    public String toString() {
        calcularPreco();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String infoBase = String.format("Validade: %s, Peso: %.3f kg", 
                                        this.dataDeValidade.format(formatador), 
                                        this.peso = 0.3);

        // Retorna uma descrição completa do item, incluindo o preço
        return String.format("Pizza: {molho='%s', recheio='%s', borda='%s', preco=R$%.2f} [%s]", 
                             molho, recheio, borda, getPreco(), infoBase);
    }
}
