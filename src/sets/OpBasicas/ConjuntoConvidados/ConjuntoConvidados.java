package sets.OpBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        convidadosSet = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidado = null;

        for (Convidado c : convidadosSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidado = c;
                break;
            }
        }

        convidadosSet.remove(convidado);

    }

    public int contarConvidados(){

        return convidadosSet.size();

    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {

        var c = new ConjuntoConvidados();

        System.out.println("Tem: " + c.contarConvidados() + " convidado(s)");

        c.adicionarConvidado("Banano 1", 123);
        c.adicionarConvidado("Banano 2", 321);
        c.adicionarConvidado("Banano 3", 213);
        c.adicionarConvidado("Banano 4", 132);
        c.adicionarConvidado("Banano 5", 231);
        c.adicionarConvidado("Banano 6", 123);

        System.out.println("Tem: " + c.contarConvidados() + " convidado(s)");

        c.removerConvidadoPorCodigoConvite(132);

        System.out.println("Tem: " + c.contarConvidados() + " convidado(s)");

        c.exibirConvidados();

    }

}
