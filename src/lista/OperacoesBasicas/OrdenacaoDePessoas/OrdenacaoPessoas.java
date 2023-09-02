package lista.OperacoesBasicas.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{

    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas(){
        pessoasList = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){

        pessoasList.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordenarPorIdade(){

        List<Pessoa> pessoaPorIdade = new ArrayList<Pessoa>(pessoasList);

        Collections.sort(pessoaPorIdade);

        return pessoaPorIdade;

    }

    public List<Pessoa> ordenarPorAltura(){

        List<Pessoa> pessoaPorAltura = new ArrayList<Pessoa>(pessoasList);

        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

        return pessoaPorAltura;

    }

    public static void main(String[] args) {

        var p = new OrdenacaoPessoas();

        p.adicionarPessoa("Pessoa 1", 18, 1.50);
        p.adicionarPessoa("Pessoa 2", 26, 1.70);
        p.adicionarPessoa("Pessoa 3", 50, 1.69);
        p.adicionarPessoa("Pessoa 4", 43, 1.26);
        p.adicionarPessoa("Pessoa 5", 28, 1.16);
        p.adicionarPessoa("Pessoa 6", 80, 2.80);

        System.out.println(p.ordenarPorAltura());
        System.out.println(p.ordenarPorIdade());
        
    }
    
}
