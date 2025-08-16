package ex_classe_abstrata;

public class Cliente extends Pessoa{

    protected int codigo;

    public Cliente(int codigo, String nome, Data nascimento) {
        super (nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public String imprimeDados() {
        return String.format("Cliente: %s\nCódigo: %d\nData de Nascimento: %s", 
                             nome, codigo, nascimento.toString());
    }
    
}
