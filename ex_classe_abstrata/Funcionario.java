package ex_classe_abstrata;

public class Funcionario extends Pessoa {

    protected Float salario;

    public Funcionario(String nome, Data nascimento, Float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }


    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public Float calculaImposto(){
        salario = salario - (salario * 0.3f);
        return salario;
    }

    @Override
    public String imprimeDados() {
        return String.format("Nome: %s\nNascimento: %s\nSalário: %.2f",
                nome, nascimento.toString(), calculaImposto());
    }
    
}
