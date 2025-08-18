package ex34_vcRiquinho;

import java.time.LocalDate;

public class RendaFixa extends ProdutosFinanceiros {
    
    protected LocalDate periodoCarencia; // tempo mínimo antes que o dinheiro possa ser retirado


     private double rendimentoMensal;
    private int periodoCarenciaDias;

    public RendaFixa(String nome, String descricao, double rendimentoMensal, int periodoCarenciaDias){
        super(nome, descricao);
        this.rendimentoMensal = rendimentoMensal;
        this.periodoCarenciaDias = periodoCarenciaDias;
    }

    public int getPeriodoCarenciaDias() {
        return this.periodoCarenciaDias;
    }
    public double getRendimentoMensal() {
        return this.rendimentoMensal;
    }
    
    @Override
    public double calcularRendimentoProjetado(double valorInvestido, int dias) {
        double taxaDiaria = this.rendimentoMensal / 30.0;
        return valorInvestido * taxaDiaria * dias;
    }



}
