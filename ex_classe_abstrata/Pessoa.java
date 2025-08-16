package ex_classe_abstrata;

public abstract class Pessoa {

    protected String nome;
    protected Data nascimento;

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public Data getNascimento() {
        return nascimento;
    }
    
    public abstract String imprimeDados();

  
}
