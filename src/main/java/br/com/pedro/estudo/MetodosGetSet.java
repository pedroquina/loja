package br.com.pedro.estudo;

public class MetodosGetSet {
    
    private String nome; //  set/get
    private Integer idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        if ( idade>0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }
    }



}
