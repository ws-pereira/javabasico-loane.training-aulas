package br.com.wspereira.javabasico.Aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{

    private int tamamho;
    private String raca;

    public int getTamamho() {
        return tamamho;
    }

    public void setTamamho(int tamamho) {
        this.tamamho = tamamho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
