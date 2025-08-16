package ex_classe_abstrata;

public class cadastroPessoas {
    private Pessoa[] pessoas;  // array de Pessoas
    private int qtdAtual;      // quantidade já cadastrada


    public cadastroPessoas(int tamanho) {
        pessoas = new Pessoa[tamanho];
        qtdAtual = 0;
    }


    public void cadastraPessoa(Pessoa p) {
        if (qtdAtual < pessoas.length) {
            pessoas[qtdAtual] = p;  // guarda no array
            qtdAtual++;             // incrementa
        } else {
            System.out.println("Cadastro cheio!");
        }
    }

    // imprime cadastro
    public void imprimeCadastro() {
        System.out.println("Cadastro de Pessoas:");
        for (int i = 0; i < qtdAtual; i++) {
            System.out.println(pessoas[i].imprimeDados()); 
            System.out.println("------------------");
        }
        System.out.println("Total cadastrados: " + qtdAtual);
    }
}
