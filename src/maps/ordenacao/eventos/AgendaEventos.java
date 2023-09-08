package maps.ordenacao.eventos;

import java.time.LocalDate;
// import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
// import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
    
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosOrdem = new TreeMap<>(this.eventos);
        System.out.println("----------------------");
        System.out.println(eventosOrdem);
        System.out.println("----------------------");
    }

    public Evento obterProximoEvento() {

        Evento e = null;

        // Coleções independentes
        // Set<LocalDate> keySet = eventos.keySet();
        // Collection<Evento> values = eventos.values();

        // PEga a data atual
        LocalDate dataAtual = LocalDate.now();

        Map<LocalDate, Evento> eventosOrdem = new TreeMap<>(this.eventos);

        // para retornas chaves / valores
        for (Map.Entry<LocalDate, Evento> entry : eventosOrdem.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                e = entry.getValue();
                break;
            }
        }

        return e;

    }

    public static void main(String[] args) {
        
        var a = new AgendaEventos();

        a.adicionarEvento(LocalDate.now(), "Evento 2", "Lamburguini");
        a.adicionarEvento(LocalDate.parse("2008-12-03"), "Evento 3", "Ferréri");
        a.adicionarEvento(LocalDate.parse("2027-06-09"), "Evento 4", "Bugátì");

        a.exibirAgenda();

        System.out.println("Próximo evento: " + a.obterProximoEvento());

    }

}
