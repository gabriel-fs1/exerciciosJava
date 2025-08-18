package ex34_vcRiquinho;

public abstract class ProdutosFinanceiros {

    protected String nome;
    protected String descricao;


    public ProdutosFinanceiros(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularRendimentoProjetado(double valorInvestido, int dias);

}
