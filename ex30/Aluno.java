package ex30;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Aluno {

    String nome;
    double nota;
    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return this.nome;
    }
    
    public double getNota() {
        return this.nota;
    }

    @Override
    public String toString() {
        return nome + " - " + nota;
    }

    public static void main(String[] args) {
        Map<String, List<Aluno>> status = new HashMap<>();

        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();
        List<Aluno> recuperacao = new ArrayList<>();

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Diogo", 9.5));
        alunos.add(new Aluno("Davi", 6.0));
        alunos.add(new Aluno("Ana", 8.5));
        alunos.add(new Aluno("Bruno", 7.0));
        alunos.add(new Aluno("Eduardo", 8.0));
        alunos.add(new Aluno("Maria", 5.0));
        alunos.add(new Aluno("Joao", 1.0));
        alunos.add(new Aluno("Gabriel", 2.0));


        for (Aluno aluno : alunos) {
            if (aluno.getNota() >= 7) {
                aprovados.add(aluno);
            } else if (aluno.getNota() >= 5 && aluno.getNota() < 7) {
                recuperacao.add(aluno);
            } else {
                reprovados.add(aluno);
            }
        }

        status.put("Aprovado", aprovados);
        status.put("Recuperação", recuperacao);
        status.put("Reprovado", reprovados);

        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : status.get("Aprovado")) {
            System.out.println(aluno);
        }

        System.out.println("\nAlunos em Recuperação:");
        for (Aluno aluno : status.get("Recuperação")) {
            System.out.println(aluno);
        }

        System.out.println("\nAlunos Reprovados:");
        for (Aluno aluno : status.get("Reprovado")) {
            System.out.println(aluno);
        }
    }
}
