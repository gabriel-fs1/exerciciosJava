package ex_classe_abstrata;

public class TesteCadastro {

    public static void main(String[] args) {
        cadastroPessoas cadastro = new cadastroPessoas(3);
        
        Pessoa cliente = new Cliente(1, "João", new Data(15, 5, 1990));
        Pessoa gerente = new Gerente("Maria", new Data(20, 8, 1985), 10000.0f, "Gerente");
        Pessoa funcionario = new Funcionario("Carlos", new Data(10, 3, 1982), 3000.0f);
        
        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(gerente);
        cadastro.cadastraPessoa(funcionario);

        cadastro.imprimeCadastro();
        
        
    }
    
}
