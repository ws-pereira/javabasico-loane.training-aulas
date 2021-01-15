package br.com.wspereira.javabasico.Aula44;

public interface AnimalDomesticado {

    // Todo atributo dentro de interface deve ser public final
    public final int ANO = 2016;

    public abstract void levarVeterinario();
    public abstract void alimentar();
}
