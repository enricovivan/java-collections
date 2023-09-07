package maps.basicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    
    private Map<String, String> dict;

    public Dicionario() {
        dict = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dict.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dict.isEmpty()) {
            if (dict.containsKey(palavra)) {
                dict.remove(palavra);
            }
        }
    }

    public void exibirPalavras() {
        System.out.println("-------------------------");
        System.out.println(dict);
        System.out.println("-------------------------");
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavras = null;
        
        if (!dict.isEmpty()) {
            if(dict.containsKey(palavra)){
                palavras = dict.get(palavra);
            }
        }

        return palavras;
    }

    public static void main(String[] args) {
        
        var a = new Dicionario();

        a.exibirPalavras();

        a.adicionarPalavra("1", "um");
        a.adicionarPalavra("2", "dois");
        a.adicionarPalavra("3", "tres");
        a.adicionarPalavra("4", "quatro");

        a.exibirPalavras();

        a.removerPalavra("2");

        a.exibirPalavras();

        System.out.println("Significado: " + a.pesquisarPorPalavra("3"));


    }

}
