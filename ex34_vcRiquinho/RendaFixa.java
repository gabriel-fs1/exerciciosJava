package ex34_vcRiquinho;

import java.time.LocalDate;

public class RendaFixa extends ProdutosFinanceiros {
    
    protected LocalDate periodoCarencia; // tempo mínimo antes que o dinheiro possa ser retirado


    public RendaFixa(String nome, String descricao, LocalDate periodoCarencia) {
        super(nome, descricao);
        this.periodoCarencia = periodoCarencia;
    }

    public Double RendimentoMensalFixo() {
        return 0.0; // Implementar lógica de cálculo do rendimento fixo
    }

}
