package br.com.wspereira.javabasico.Aula44;

public abstract class Animal {

    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
