package sets.pesquisa.agenda;

public class Contato {
    
    private String nome;
    private Integer tel;
    
    public Contato() {
    }
    
    public Contato(String nome, Integer tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getTel() {
        return tel;
    }
    public void setTel(Integer tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", tel=" + tel + "]";
    }

    

}
