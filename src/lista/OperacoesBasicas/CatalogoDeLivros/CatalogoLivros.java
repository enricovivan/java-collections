package lista.OperacoesBasicas.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> listaLivros = new ArrayList<Livro>();

    public void adicionaLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String nomeAutor) {

        if (!listaLivros.isEmpty()) {

            List<Livro> livros = new ArrayList<Livro>();

            for (Livro l : listaLivros) {
                if (l.getAutor().equals(nomeAutor)) {
                    livros.add(l);
                }
            }

            return livros;
        }

        return null;

    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {

        if (!listaLivros.isEmpty()){
            List<Livro> livros = new ArrayList<Livro>();

            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livros.add(l);
                }
            }

            return livros;
        }

        return null;

    }

    public Livro pesquisarPorTitulo(String titulo) {

        if (!listaLivros.isEmpty()){
            for (Livro l : listaLivros) {
                if (l.getTitulo().equals(titulo)) {
                    return l;
                }
            }
        }

        return null;

    }

    public void todosOsLivros() {
        System.out.println("-------------------------");

        System.out.println(listaLivros);

        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        var c = new CatalogoLivros();

        c.adicionaLivro("Abacates Voadores", "Eu", 2000);
        c.adicionaLivro("Mamões Voadores", "Eu", 2010);
        c.adicionaLivro("Elipses Voadores", "Eu", 2015);
        c.adicionaLivro("Joias Reais", "José", 1915);
        c.adicionaLivro("Super Pão", "Mario", 1985);
        c.adicionaLivro("Cinco Seis Sete", "Silva", 2000);

        c.todosOsLivros();

        System.out.println(c.pesquisaPorAutor("Silva"));
        System.out.println("--------------------------\n");

        System.out.println(c.pesquisarPorIntervaloAnos(1900, 1999));
        System.out.println("--------------------------\n");

        System.out.println(c.pesquisarPorTitulo("Elipses Voadores"));
        System.out.println("--------------------------");

    }

}
