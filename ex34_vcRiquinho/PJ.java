package ex34_vcRiquinho;

import java.util.ArrayList;

public class PJ extends Cliente{
    private String cnpj;

    public PJ(String nome, String email, ArrayList<Contas> contas, String cnpj) {
        super(nome, email, contas);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void criarConta() {
        
    }
    
}
