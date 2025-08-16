package ex34_lanchonete;

import java.time.LocalDate;

public abstract class Prato {

    protected Double preco;
    protected LocalDate dataDeValidade;
    protected Double peso;

    public Prato() {
        this.dataDeValidade = LocalDate.now().plusDays(7); // Exemplo: validade de 7 dias
        this.peso = 0.0; 
    }


    public Double getPreco() {
        return preco;
    }


    public abstract void calcularPreco();

    @Override
    public String toString() {
        return "Prato{" +
                "preco=" + preco +
                ", dataDeValidade=" + dataDeValidade +
                ", peso=" + getPreco() +
                '}';
    }
    
}
