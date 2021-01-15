package br.com.wspereira.javabasico.Aula36.labs01;

public class Contato {

    private String nome;
    private String email;
    //private Telefone[] telefones;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String obterInfor(){
        return "Nome - " +nome+ " - " +
                "Telefone - "+telefone+ " - " +
                "E-mail - "+email;
    }

    /* public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }*/
}
