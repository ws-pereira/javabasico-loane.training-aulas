package br.com.wspereira.javabasico.Aula36.labs01;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();
        System.out.print("Nome da Agenda ");
        agenda.setNome(sc.nextLine());

        Contato[] contatos = new Contato[3]; // Criando o array de contatos
        System.out.println("Entre com tres contatos ");

        for(int x = 0; x < 3; x++){
            System.out.println("Entre com o contato "+(x+1));
            Contato c = new Contato();
            System.out.print("Nome - ");
            String nome = sc.nextLine();
            c.setNome(nome);

            System.out.print("Telefone - ");
            String telefone = sc.nextLine();
            c.setTelefone(telefone);

            System.out.print("E-mail - ");
            String email = sc.nextLine();
            c.setEmail(email);

            contatos[x] = c; // Adicionando objeto criados no array

            System.out.println();
        }
        agenda.setContatos(contatos);
        if(agenda != null){
            System.out.println(agenda.obterInfor());
        }
     }
}
