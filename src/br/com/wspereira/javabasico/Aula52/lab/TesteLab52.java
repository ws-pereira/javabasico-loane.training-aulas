package br.com.wspereira.javabasico.Aula52.lab;

import java.util.Scanner;

public class TesteLab52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int op = 1;

        while (op != 3){
            op = obterOpcaoMenu(sc);
            if(op == 1){
                // Consultar contato
                consultarContato(sc, agenda);
            }
            else if (op == 2 ){
                // Adicoinar contato
                adicoinarContato(sc, agenda);

            }
            else if (op ==3){
                // Encerrar
                System.exit(0);
            }
        }


    }

    public static int obterOpcaoMenu(Scanner sc) {

        boolean entradaValida = false;
        int op = 3;

        while (!entradaValida) {
            System.out.println("1 - Consultar Contato");
            System.out.println("2 - Adicionar Contato");
            System.out.println("3 - Sair");
            System.out.println("Digite a opção desejada: ");

            try {
                String entrada = sc.nextLine();
                op = Integer.parseInt(entrada);

                if (op == 1 || op == 2 || op == 3) {
                    entradaValida = true;
                }
                else {
                    throw new Exception("Entrada invalida");
                }
            } catch (Exception e) {
                System.out.println("Entrada errada, digite novamente\n");
            }
        }
        return op;
    }

    public static String lerInformacaoString (Scanner sc, String msg){
        System.out.print(msg);
        String entradaMsg = sc.nextLine();
        return entradaMsg;
    }

    public static void consultarContato(Scanner sc, Agenda agenda){
        String nomeContato = lerInformacaoString(sc, "Entre com o contato a ser pesquisado - ");

        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }
        }
        catch(ContatoNaoExisteException e){
            System.out.println(e.getMessage());
        }
    }

    public static void adicoinarContato(Scanner sc, Agenda agenda){
        try {
            System.out.println("Criando contato");
            String name = lerInformacaoString(sc, "Entre com  o nome - ");
            String phone = lerInformacaoString(sc, "Entre com o telefone - ");
            String email = lerInformacaoString(sc, "Enter com o email - ");
            Contato contato = new Contato();
            contato.setName(name);
            contato.setPhone(phone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado");
            System.out.println(contato);

            agenda.adicionarContato(contato);
        }
        catch (AgendaCheiaException e){
            System.out.println(e.getMessage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }
}