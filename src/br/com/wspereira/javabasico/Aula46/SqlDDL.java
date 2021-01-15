package br.com.wspereira.javabasico.Aula46;

public interface SqlDDL {

    void create(String access);
    void alter(String Access);
    void drop(String query);
}
