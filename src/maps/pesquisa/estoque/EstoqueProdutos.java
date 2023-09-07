package maps.pesquisa.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println("-------------------------");
        System.out.println(produtos);
        System.out.println("-------------------------");
    }

    public Double calcularValorTotalEstoque() {

        Double valorTotal = 0D;

        if (!produtos.isEmpty()){

            for (Produto p: produtos.values()) {

                valorTotal += p.getPreco() * p.getQuantidade();

            }

        }

        return valorTotal;

    }

    public Produto obterProdutoMaisCaro() {

        Produto prodCaro = null;
        Double caro = Double.MIN_VALUE;

        if (!produtos.isEmpty()) {
            
            for (Produto p : produtos.values()) {

                if (p.getPreco() > caro) {

                    caro = p.getPreco();
                    prodCaro = p;

                }

            }

        }

        return prodCaro;

    }

    public Produto obterProdutoMaisBarato() {

        Produto prodBarato = null;
        Double barato = Double.MAX_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (p.getPreco() < barato) {
                    barato = p.getPreco();
                    prodBarato = p;
                }
            }
        }

        return prodBarato;

    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto prodCaro = null;
        Double caro = Double.MIN_VALUE;

        if (!produtos.isEmpty()) {
            for (Produto p : produtos.values()) {
                if (p.getPreco()*p.getQuantidade() > caro) {
                    caro = p.getPreco()*p.getQuantidade();
                    prodCaro = p;
                }
            }
        }

        return prodCaro;
    }

    public static void main(String[] args) {
        
        var a = new EstoqueProdutos();

        a.exibirProdutos();

        a.adicionarProduto(11L, "Uva", 1, 25);
        a.adicionarProduto(12L, "Pera", 5, 1.50);
        a.adicionarProduto(13L, "Maçã", 2, 22);
        a.adicionarProduto(14L, "Abacate", 6, 10);
        a.adicionarProduto(15L, "Banana", 12, 1.60);

        a.exibirProdutos();

        System.out.println("\nValor Total Estoque: " + a.calcularValorTotalEstoque());

        System.out.println("\nMais Barato: " + a.obterProdutoMaisBarato());
        System.out.println("Mais Caro..: " + a.obterProdutoMaisCaro());

        System.out.println("Maior Valor com Quantidade: " + a.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }

}
