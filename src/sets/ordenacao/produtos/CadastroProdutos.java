package sets.ordenacao.produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<Produto>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {

        Set<Produto> produtosPorNome = new TreeSet<Produto>(produtos);
        
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());

        produtoPorPreco.addAll(produtos);

        return produtoPorPreco;
    }

    public static void main(String[] args) {
        
        var c = new CadastroProdutos();

        c.adicionarProduto(0001, "P 1", 15.98, 2);
        c.adicionarProduto(0002, "P 2", 20.98, 1);
        c.adicionarProduto(0003, "P 3", 123.98, 6);
        c.adicionarProduto(0004, "P 4", 1.98, 8);
        c.adicionarProduto(0005, "P 5", 15.98, 2);
        c.adicionarProduto(0006, "P 6", 0.98, 20);

        System.out.println("------- Prod por Nome -------");
        System.out.println(c.exibirProdutosPorNome());
        System.out.println("-----------------------------");

        System.out.println("------- Prod por Preço -------");
        System.out.println(c.exibirProdutosPorPreco());
        System.out.println("------------------------------");


    }
    
    
}
