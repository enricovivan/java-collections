package sets.pesquisa.tarefas;

public class Tarefa {
    
    private String descricao;
    private boolean concluida = false;
    
    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "[descricao=" + descricao + ", concluida=" + concluida + "]\n";
    }

    

}
