package ex34_vcRiquinho;

import java.util.ArrayList;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected ArrayList<Contas> contas;

    public Cliente(String nome, String email, ArrayList<Contas> contas) {
        this.nome = nome;
        this.email = email;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Contas> getContas() {
        return contas;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setContas(ArrayList<Contas> contas) {
        this.contas = contas;
    }

    public abstract void criarConta();
}
