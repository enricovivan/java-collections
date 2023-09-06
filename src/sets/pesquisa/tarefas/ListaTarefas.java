package sets.pesquisa.tarefas;

import java.util.HashSet;
import java.util.Set;

class ListaTarefas {

    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        
        Set<Tarefa> tarefasRemover = new HashSet<Tarefa>();

        for (Tarefa t : tarefas) {
            if (t.getDescricao().equals(descricao)) {
                tarefasRemover.add(t);
                break;
            }
        }

        tarefas.removeAll(tarefasRemover);

    }

    public void exibirTarefas() {

        System.out.println("---------------------");
        System.out.println(tarefas);
        System.out.println("---------------------");

    }

    public int contarTarefas() {

        return tarefas.size();

    }

    public Set<Tarefa> obterTarefasConcluidas() {

        Set<Tarefa> tarefasConcluidas = new HashSet<Tarefa>();

        for (Tarefa t : tarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;

    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<Tarefa>();

        for (Tarefa t : tarefas) {
            if (!t.isConcluida()){
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {

        Tarefa tarefa = null;

        for (Tarefa t: tarefas) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(true);
                tarefa = t;
                break;
            }
        }

        return tarefa;

    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefa = null;

        for (Tarefa t : tarefas) {
            if (t.getDescricao().equals(descricao)) {
                t.setConcluida(false);
                tarefa = t;
                break;
            }
        }

        return tarefa;
    }

    public void limpaListaTarefas() {
        tarefas.removeAll(tarefas);
        System.out.println("Todas as tarefas foram removidas!!!");
    }

    public static void main(String[] args) {
        
        var lt = new ListaTarefas();

        lt.exibirTarefas();

        lt.adicionarTarefa("M 1");
        lt.adicionarTarefa("M 2");
        lt.adicionarTarefa("M 3");
        lt.adicionarTarefa("M 4");
        lt.adicionarTarefa("M 5");
        lt.adicionarTarefa("M 6");
        lt.adicionarTarefa("M 7");
        lt.adicionarTarefa("M 8");
        lt.adicionarTarefa("M 9");

        lt.exibirTarefas();

        System.out.println("Quantidade de tarefas: " + lt.contarTarefas());
        System.out.println("----------------------");

        lt.removerTarefa("M 9");

        System.out.println("Quantidade de tarefas: " + lt.contarTarefas());
        System.out.println("----------------------");

        lt.exibirTarefas();

        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());

        lt.marcarTarefaConcluida("M 2");
        lt.marcarTarefaConcluida("M 4");

        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());

        lt.marcarTarefaPendente("M 2");
        
        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());

        lt.limpaListaTarefas();

        lt.exibirTarefas();


    }

    

}