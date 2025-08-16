package ex_classe_abstrata;

public class TesteCadastro {

    public static void main(String[] args) {
        cadastroPessoas cadastro = new cadastroPessoas();
        
        Pessoa cliente = new Cliente(1, "João", new Data(15, 5, 1990));
        Pessoa gerente = new Gerente("Maria", new Data(20, 8, 1985), 10000.0f, "Gerente");
        Pessoa funcionario = new Funcionario("Carlos", new Data(10, 3, 1982), 3000.0f);
        
        cadastro.cadastraPessoa(cliente);
        cadastro.cadastraPessoa(gerente);
        cadastro.cadastraPessoa(funcionario);
        
        System.out.println(cadastro.imprimeCadastro());
        System.out.println("\n");
        System.out.println(cliente.imprimeDados());
        System.out.println("\n");
        System.out.println(gerente.imprimeDados());
        System.out.println("\n");
        System.out.println(funcionario.imprimeDados());
        System.out.println("\n");
        
    }
    
}
