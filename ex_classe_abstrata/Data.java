package ex_classe_abstrata;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia inválido. Deve ser entre 1 e 31.");
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("Mês inválido. Deve ser entre 1 e 12.");
        }
        this.mes = mes;
    }

    public void setAno(int ano) {
        if (ano < 0) {
            throw new IllegalArgumentException("Ano inválido. Deve ser um número positivo.");
        }
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
    
}
