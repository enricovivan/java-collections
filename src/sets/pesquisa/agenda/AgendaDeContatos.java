package sets.pesquisa.agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaDeContatos {
    
    private Set<Contato> contatoList;

    public AgendaDeContatos() {
        contatoList = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoList.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println("----------------------");
        System.out.println(contatoList);
        System.out.println("----------------------");
    }

    public Set<Contato> pesquisarPorNome(String nome) {

        Set<Contato> contTemp = new HashSet<Contato>();

        for (Contato c : contatoList) {
            if (c.getNome().equals(nome)) {
                contTemp.add(c);
            }
        }

        return contTemp;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {

        Contato contatoAtt = null;

        for (Contato c: contatoList) {
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setTel(novoNumero);
                contatoAtt = c;
                break;
            }
        }

        return contatoAtt;

    }

    public static void main(String[] args) {
        
        AgendaDeContatos a = new AgendaDeContatos();

        a.exibirContatos();

        a.adicionarContato("Contato 1", 1123);
        a.adicionarContato("Contato 2", 1123);
        a.adicionarContato("Contato 3", 1123);
        a.adicionarContato("Contato 4", 1123);
        a.adicionarContato("Contato 5", 1123);
        a.adicionarContato("Contato 6", 1123);

        a.exibirContatos();

        a.atualizarNumeroContato("Contato 2", 3214);

        a.exibirContatos();

        System.out.println("-------------------");
        System.out.println(a.pesquisarPorNome("Contato 2"));
        System.out.println("-------------------");


    }

}
