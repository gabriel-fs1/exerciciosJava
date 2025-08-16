package ex_classe_abstrata;

public class Gerente extends Funcionario{

    protected String area;

    public Gerente(String nome, Data nascimento, Float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public Float calculaImposto() {
        salario = salario - (salario * 0.5f);
        return salario;
    }

    @Override
    public String imprimeDados() {
        return String.format("Nome: %s\nNascimento: %s\nSalário (com desconto): %.2f\nÁrea: %s",
                nome, nascimento.toString(), calculaImposto(), area);
    }
    
}
