package ex34_vcRiquinho;

import java.util.ArrayList;
public class ContaInvestimentoAutomatico extends Contas implements Tributavel {

    private Double taxaRendimento;
    
    private ArrayList<ProdutosFinanceiros> produtosFinanceiros;
    
    public ContaInvestimentoAutomatico(Double saldo, Cliente donoDaConta, Double taxaRendimento) {
        super(saldo, donoDaConta);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public Double calcularRendimento(int periodoEmDias) {
        return saldo * (taxaRendimento / 100) * (periodoEmDias / 365.0);
    }

    @Override
    public double calcularTaxaServico(double rendimentoBruto) {
        if (donoDaConta instanceof PF) {
            return rendimentoBruto * 0.001; // Taxa de 0,1% para PF 
        } else if (donoDaConta instanceof PJ) {
            return rendimentoBruto * 0.0015; // Taxa de 0,15% para PJ 
        }
        return 0;
    }
}
