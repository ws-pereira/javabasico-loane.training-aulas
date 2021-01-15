package br.com.wspereira.javabasico.Aula37.ExercAula;

import br.com.wspereira.javabasico.Aula36.ExercAula.Telefone;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        System.out.print("Matricula - ");
        String matriculaAluno = sc.nextLine();
        System.out.print("Aluno - ");
        String nomeAluno = sc.nextLine();

        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(matriculaAluno);
        aluno.setNome(nomeAluno);

        System.out.println();
        sc.close();



    }
}
