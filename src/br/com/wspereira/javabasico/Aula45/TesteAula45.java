package br.com.wspereira.javabasico.Aula45;

public class TesteAula45 {

    public static void main(String args[]){

        Aluno aluno = new Aluno();

        Pessoa pessoaAluno = aluno; // upcasting

        Pessoa aluno2 =  (Pessoa) new Aluno();

        Pessoa aluno3 = new Pessoa();
        Aluno aluna4 = (Aluno) aluno3;

    }
}
