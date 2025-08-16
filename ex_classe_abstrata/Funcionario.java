package ex_classe_abstrata;

public class Funcionario extends Pessoa {

    protected Float salario;

    public Funcionario(String nome, Data nascimento, Float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public void setSalario(Float salario) {

        if (salario <= 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo nem zero.");
        }
        this.salario = salario;
    }

    public Float calculaImposto(){
        salario = salario - (salario * 0.3f);
        return salario;
    }

    @Override
    public String imprimeDados() {
        return String.format("Nome: %s\nNascimento: %s\nSalário (com desconto): %.2f",
                nome, nascimento.toString(), calculaImposto());
    }
    
}
