package br.com.wspereira.javabasico.Aula43.lab03;

public  class Animal {

    private String nome;
    private String comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        this.numPatas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "nome - '" + nome +
                "\ncomprimento - " + comprimento +
                "\nnumPatas - " + numPatas +
                "\ncor - " + cor +
                "\nambiente - " + ambiente +
                "\nvelocidade - " + velocidade
                ;
    }
}
