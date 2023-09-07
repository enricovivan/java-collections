package maps.pesquisa.contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            if (palavras.containsKey(palavra)) {
                palavras.remove(palavra);
            }
        }
    }

    public void exibirContagemPalavras() {
        System.out.println("---------------------------");
        System.out.println(palavras);
        System.out.println("---------------------------");
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {

        Map<String, Integer> pp = new HashMap<>();
        Integer contagem = Integer.MIN_VALUE;

        if (!palavras.isEmpty()) {

            for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
                if (entry.getValue() > contagem) {
                    contagem = entry.getValue();
                    pp.put(entry.getKey(), entry.getValue());
                }
            }

        }

        return pp;

    }

    public static void main(String[] args) {
        
        var p = new ContagemPalavras();

        p.exibirContagemPalavras();

        p.adicionarPalavra("Ola", 1);
        p.adicionarPalavra("Alou", 12);
        p.adicionarPalavra("Bom Dia", 2);
        p.adicionarPalavra("Certo", 14);
        p.adicionarPalavra("Shalalala", 6);

        p.exibirContagemPalavras();

        p.removerPalavra("Shalalala");

        p.exibirContagemPalavras();

        System.out.println("Palavra mais Frequente: " + p.encontrarPalavraMaisFrequente());

    }

}
