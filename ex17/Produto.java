package ex17;

import java.util.TreeSet;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Produto outro) {
            return Double.compare(this.preco, outro.preco);
        }

    @Override
    public String toString() {
        return 
                "nome:'" + nome + '\'' +
                ", preco:" + preco ;
    }


public static void main(String[] args) {
        TreeSet<Produto> produtos = new TreeSet<>();
        
        produtos.add(new Produto("Produto A", 10.99));
        produtos.add(new Produto("Produto B", 5.49));
        produtos.add(new Produto("Produto C", 7.99));
        

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        
    }
}
