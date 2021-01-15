package br.com.wspereira.javabasico.Aula36.ExercAula;

public class Contato {

    private String nome;
    private Endereco endereco;    // Tem um endereco
    private Telefone[] telefones; // Tem muitos telefones

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }
}
