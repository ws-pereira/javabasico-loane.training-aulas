package br.com.wspereira.javabasico.Aula46;

public interface BancoDados extends SqlDCL, SqlDDL, SQLDML {

    void abrirConexao();
    void fecharCoenxao();
}
