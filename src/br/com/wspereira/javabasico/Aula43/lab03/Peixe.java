package br.com.wspereira.javabasico.Aula43.lab03;

public class Peixe extends Animal{

    private String caracteristica;


    public Peixe() {

    }

    public Peixe(String caracteristica) {
        super();
    }


    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nCaracterísitca - "+caracteristica;

    }
}
