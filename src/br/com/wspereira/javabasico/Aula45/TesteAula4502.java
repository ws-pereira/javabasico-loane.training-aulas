package br.com.wspereira.javabasico.Aula45;

public class TesteAula4502 {

    public static void main (String args[]){

        /*Object obj1 = obterString();
        String s1 = (String) obj1;

        Object obj2 = "Minha string";
        String s2 = (String) obj2;

        Object obj3 = new Object();
        String s3 = (String) obj3;

        Object obj4 = obterInteiro();
        String s4 = (String) obj4;

        System.out.println(s3);*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // Verifica qual o tipo de classe
        if(pessoa instanceof Pessoa){
            System.out.println("é do tipo pessoa");
        }

        if(aluno instanceof Aluno){
            System.out.println("é do tipo aluno");
        }

        if(professor instanceof Professor){
            System.out.println("é do tipo professor");
        }
    }

    public static String obterString(){
        return "Minha string";
    }

    public static int obterInteiro(){
        return 1;
    }
}
