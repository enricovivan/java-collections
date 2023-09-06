package sets.ordenacao.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<Aluno>();
    }

    public void adicionarAluno(String nome, Long matricula, Double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }

    public Set<Aluno> removerAluno(long matricula) {
        
        Set<Aluno> alunoRemover = new HashSet<Aluno>();

        for (Aluno i : alunos) {
            if (i.getMatricula().equals(matricula)) {
                alunoRemover.add(i);
                alunos.removeAll(alunoRemover);
                break;
            }
        }

        return alunoRemover;

    }

    public Set<Aluno> exibirAlunosPorNome() {

        Set<Aluno> alunosPorNome = new TreeSet<Aluno>(alunos);

        return alunosPorNome;

    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new AlunoPorNota());

        alunosPorNota.addAll(alunos);

        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println("----------------------");
        System.out.println(alunos);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        
        var g = new GerenciadorAlunos();

        g.adicionarAluno("A 1", 001L, 25.5);
        g.adicionarAluno("A 2", 002L, 50D);
        g.adicionarAluno("A 3", 003L, 70D);
        g.adicionarAluno("A 4", 004L, 10D);
        g.adicionarAluno("A 5", 005L, 12D);

        g.exibirAlunos();

        g.removerAluno(003L);

        g.exibirAlunos();

        System.out.println("------- Alunos por Nome -------");
        System.out.println(g.exibirAlunosPorNome());
        System.out.println("-------------------------------");
        
        System.out.println("------- Alunos por Nota -------");
        System.out.println(g.exibirAlunosPorNota());
        System.out.println("-------------------------------");


    }

}
