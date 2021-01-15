package br.com.wspereira.javabasico.Aula52.lab;

public class ContatoNaoExisteException extends Exception{

    private String name;

    public ContatoNaoExisteException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "Contrato " + name + " não existe na agenda";
    }
}
