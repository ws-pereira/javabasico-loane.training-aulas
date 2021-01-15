package br.com.wspereira.javabasico.Aula46;

public interface SQLDML {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}
