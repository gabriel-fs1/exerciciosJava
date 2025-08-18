package ex34_vcRiquinho;


public class PF extends Cliente{
    private String cpf;
    

    public PF(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        
}
