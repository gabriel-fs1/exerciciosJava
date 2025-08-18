package ex34_vcRiquinho;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

    protected String nome;
    protected String email;
    protected List<Contas> contas;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionarConta(Contas novaConta){
        this.contas.add(novaConta);
    }

    public boolean removerConta(Contas conta){
        return this.contas.remove(conta);
    }

    public List<Contas> getContas() {
        return this.contas;
    }




}
