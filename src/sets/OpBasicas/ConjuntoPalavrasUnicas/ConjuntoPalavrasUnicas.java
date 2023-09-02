package sets.OpBasicas.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        palavras = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavras.isEmpty()){

            for (String s : palavras){

                if (s == palavra){

                    palavras.remove(palavra);
                    break;

                }

            }

        }
        else {
            System.out.println("Set vazio!!");
        }
    }

    public boolean verificaPalavra(String palavra){

        boolean palavraExiste = false;

        for (String s : palavras){

            if (s.equals(palavra)){
                palavraExiste = true;
            }

        }

        return palavraExiste;

    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavras.toString());
    }

    public static void main(String[] args) {
        
        var p = new ConjuntoPalavrasUnicas();

        p.exibirPalavrasUnicas();

        p.adicionarPalavra("Maçã");
        p.adicionarPalavra("Banana");
        p.adicionarPalavra("Pera");
        p.adicionarPalavra("Uva");
        p.adicionarPalavra("Jabuticaba");
        p.adicionarPalavra("Goiaba");
        p.adicionarPalavra("Atemoia");
        p.adicionarPalavra("Uva");

        p.exibirPalavrasUnicas();

        p.removerPalavra("Banana");

        p.exibirPalavrasUnicas();
        
        System.out.println("Palavra existe?: " + p.verificaPalavra("Banana"));


    }

}
