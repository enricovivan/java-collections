package lista.OperacoesBasicas.OrdenacaoDePessoas;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    
    private String nome;
    private Integer idade;
    private Double altura;
    
    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    
    public String getNome() {
        return nome;
    }
    
    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, o.getIdade());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]\n";
    }

    
    

}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }

}
