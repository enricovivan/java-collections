package maps.basicas.agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    
    private Map<String, Integer> agenda;

    public AgendaContatos() {
        agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agenda.isEmpty()) {
            if (agenda.containsKey(nome)) {
                agenda.remove(nome);
            }
        }
    }

    public void exibirContatos() {
        System.out.println("--------------------------");
        System.out.println(agenda);
        System.out.println("--------------------------");
    }

    public Integer pesquisaPorNome(String nome) {

        Integer numTel = null;

        if (!agenda.isEmpty()   ) {
            numTel = agenda.get(nome);
        }

        return numTel;

    }

    public static void main(String[] args) {
        
        var agenda = new AgendaContatos();

        agenda.exibirContatos();

        agenda.adicionarContato("C1", 123);
        agenda.adicionarContato("C2", 321);
        agenda.adicionarContato("C3", 213);
        agenda.adicionarContato("C4", 231);
        agenda.adicionarContato("C5", 312);

        agenda.exibirContatos();

        agenda.removerContato("C2");

        agenda.exibirContatos();

        System.out.println("Número: " + agenda.pesquisaPorNome("C3"));

    }

}
