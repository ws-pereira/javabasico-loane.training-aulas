/* Laboratório 2 - Curso Java Básico
    Instrutor - Loiane Groner
    Relação um para múltiplos
 */
package br.com.wspereira.javabasico.Aula36.labs02;

import java.util.Locale;
import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Grade de Alunos");

        // Informações do Curso

        System.out.print("Curso - ");
        String nomeCurso = sc.nextLine();
        System.out.print("Horário - ");
        String horaCurso = sc.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCurso);
        curso.setHorario(horaCurso);

        // Informações do Professor

        System.out.print("Professor - ");
        String nomeProfessor = sc.nextLine();
        System.out.print("Departamento - ");
        String dptoProfessor = sc.nextLine();
        System.out.print("E-mail - ");
        String emailProfessor = sc.next();

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(dptoProfessor);
        professor.setEmail(emailProfessor);

        // Setar o professor no curso
        curso.setProfessor(professor);

        // Informações dos Alunos
        System.out.println("------- Alunos -------");

        Aluno[] alunos = new Aluno[5];
        for(int x = 0; x < 5; x++){
            sc.nextLine();
            System.out.println("Entre com o nome e matrícula do aluno - "+(x+1));
            System.out.print("Aluno - ");
            String nomeAluno = sc.nextLine();
            System.out.print("Matricula - ");
            String matrAluno = sc.nextLine();


            // Entrada das notas do aluno
            double[] notas = new double[4];

            for(int y = 0; y < 4; y++){
                System.out.print("Nota  "+(y+1) + " - ");
                notas[y] = sc.nextDouble();

            }
            Aluno aluno = new Aluno();
            aluno.setMatricula(matrAluno);
            aluno.setNome(nomeAluno);
            aluno.setNotas(notas);
            alunos[x] = aluno;

        }

        curso.setAlunos(alunos);
        System.out.println(curso.obterInfor());

        sc.close();
    }
}
