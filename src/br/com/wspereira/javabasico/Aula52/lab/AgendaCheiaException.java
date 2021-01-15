package br.com.wspereira.javabasico.Aula52.lab;

public class AgendaCheiaException extends Exception{
    @Override
    public String getMessage() {
        return "Agenda já está cheia";
    }
}
