package ex34_lanchonete;

import java.time.format.DateTimeFormatter;

public class Salgadinho extends Prato {

    
    protected String recheio;
    protected String massa;

    public Salgadinho(String recheio, String massa) {
        super();
        this.recheio = recheio;
        this.massa = massa;
    }


    @Override
    public void calcularPreco() {
        Double basePrice = 3.5;
        if (recheio != null && !recheio.isEmpty()) {
            basePrice += 1.0; 
        }
        this.preco = basePrice;
    }

    @Override
    public String toString() {
        calcularPreco();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String infoBase = String.format("Validade: %s, Peso: %.3f kg", 
                                        this.dataDeValidade.format(formatador), 
                                        this.peso = 0.03);

        // Retorna uma descrição completa do item, incluindo o preço
        return String.format("Pizza: {recheio='%s', massa='%s', preco=R$%.2f} [%s]", 
                              recheio, massa, getPreco(), infoBase);
    }
    
}
