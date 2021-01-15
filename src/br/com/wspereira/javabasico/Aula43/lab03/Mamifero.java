package br.com.wspereira.javabasico.Aula43.lab03;

public class Mamifero extends Animal{

    private String alimento;

    public Mamifero() {
        super();
        this.setCor("Castanho");
        this.alimento = "Mel";
        this.setAmbiente("Terra");
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nAlimento - "+alimento;

    }
}
