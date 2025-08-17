package ex34_vcRiquinho;

import java.util.ArrayList;

public class PF extends Cliente{
    private String cpf;

    public PF(String nome, String email, ArrayList<Contas> contas, String cpf) {
        super(nome, email, contas);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void criarConta() {
        
    }
    
}
