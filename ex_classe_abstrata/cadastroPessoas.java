package ex_classe_abstrata;

public class cadastroPessoas {

    private int qtdAtual;

    public void cadastraPessoa(Pessoa pessoas) {
        qtdAtual++;
    }

    public String imprimeCadastro(){
        return String.format("Cadastro de Pessoas: %d pessoas cadastradas.", qtdAtual);
    }

}
