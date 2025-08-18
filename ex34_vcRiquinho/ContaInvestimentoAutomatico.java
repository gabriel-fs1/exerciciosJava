package ex34_vcRiquinho;

import java.util.List;
import java.util.ArrayList;

public class ContaInvestimentoAutomatico extends Contas implements Tributavel {

     private List<ProdutosFinanceiros> carteira;
    
    public ContaInvestimentoAutomatico(Cliente donoDaConta) {
        super(donoDaConta);
        this.carteira = new ArrayList<>();
    }

    public void adicionarProduto(ProdutosFinanceiros produto) {
        this.carteira.add(produto);
    }

    public List<ProdutosFinanceiros> getCarteira() {
        return this.carteira;
    }

    @Override
    public double calcularRendimento(int dias) {

        if(carteira.isEmpty()){
            return 0.0;
        }
        
        double saldoPorProduto = this.getSaldo()/carteira.size();
        double rendimentoTotal = 0.0;

        for (ProdutosFinanceiros produto : carteira){
            rendimentoTotal += produto.calcularRendimentoProjetado(saldoPorProduto, dias);
        }

        return rendimentoTotal;
    }

    @Override
    public double calcularTaxaServico(double rendimentoBruto) {

        Cliente dono = this.getDonoDaConta();

        if(dono instanceof PF){
            return rendimentoBruto * 0.001;
        }else{
            return rendimentoBruto * 0.0015;
        }
    }

    @Override
    public String toString() {
        return "ContaInvestimentoAutomatico (saldo:" + getSaldo() + ")";
    }
}
