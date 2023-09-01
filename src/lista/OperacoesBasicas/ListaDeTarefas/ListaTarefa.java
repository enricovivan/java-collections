package lista.OperacoesBasicas.ListaDeTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> listaDeTarefas;

    public ListaTarefa(){
        this.listaDeTarefas = new ArrayList<Tarefa>();
    }

    public void addTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<Tarefa>();

        for (Tarefa t : listaDeTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public Integer obterNumeroTotalDeTarefas (){

        return listaDeTarefas.size();

    }

    public void obterDescricoesTarefas (){

        System.out.println(listaDeTarefas);

    }

    public static void main(String[] args) {
        
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.addTarefa("Terminar o Curso Amanhã");
        listaTarefa.addTarefa("Fazer o mapa mental do curso");
        listaTarefa.addTarefa("Editar no Notion as atividades concluídas");

        System.out.println(listaTarefa.obterNumeroTotalDeTarefas());
        
        listaTarefa.removerTarefa("Fazer o mapa mental do curso");
        System.out.println(listaTarefa.obterNumeroTotalDeTarefas());

        System.out.println("----------");

        listaTarefa.obterDescricoesTarefas();

    }

}
