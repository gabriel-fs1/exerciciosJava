package ex34_vcRiquinho;

public class RendaVariavel extends ProdutosFinanceiros  {

    private double rendimentoMensalEsperado;
    
    public RendaVariavel(String nome, String descricao, double rendimentoMensalEsperado) {
        super(nome, descricao);
        this.rendimentoMensalEsperado = rendimentoMensalEsperado;
    }

    public double getRendimentoMensalEsperado() {
        return rendimentoMensalEsperado;
    }

    @Override
    public double calcularRendimentoProjetado(double valorInvestido, int dias) {
        double taxaDiaria = this.rendimentoMensalEsperado / 30.0;
        return valorInvestido * taxaDiaria * dias;
    }
}