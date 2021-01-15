package br.com.wspereira.javabasico.Aula43.lab01;

public class Teste {

    public static void main(String[] args) {




        System.out.println(" --- Teste Conta Bancária --- ");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNumConta("1234560");
        contaSimples.setNomeCliente("Wanderson conta SIMPLES");

        System.out.println(contaSimples);
        contaSimples.depositarValor(100);
        System.out.println("Depositado R$ 100,00 \n"+contaSimples);

        validaSaque(contaSimples,70);
        validaSaque(contaSimples, 40);
        System.out.println(" -------------- FIM TESTE CONTA BANCÁRIA -------------- ");
        System.out.println();

        System.out.println(" --- Teste Conta Poupança --- ");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNumConta("12345");
        contaPoupanca.setNomeCliente("Edilene Poupançca");
        contaPoupanca.setDiaRendimento(28);
        System.out.println(contaPoupanca);
        contaPoupanca.depositarValor(175.25);
        System.out.println(contaPoupanca);
        if(contaPoupanca.atualizaSaldo(0.05)) {
            System.out.println(contaPoupanca);
        }
        validaSaque(contaPoupanca,70);
        validaSaque(contaPoupanca, 40);

        System.out.println(" -------------- FIM TESTE CONTA POUPANÇA -------------- ");
        System.out.println();

        System.out.println(" --- Teste Conta Especial --- ");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNumConta("543210");
        contaEspecial.setNomeCliente("Pedro Limite");
        contaEspecial.setLimite(50);

        System.out.println(contaEspecial);
        contaEspecial.depositarValor(0);
        System.out.println(contaEspecial);


        validaSaque(contaEspecial,70);
        validaSaque(contaEspecial, 40);
        validaSaque(contaEspecial, 10);

        System.out.println();

    }

    public static void validaSaque(ContaBancaria conta, double valor){

        if(conta.sacarValor(valor)){
            System.out.println("Saque de "+valor+", efetuado com sucesso. Saldo atual - R$ "+conta.getSaldo());
        }
        else{
            System.out.println("Saldo insuficiente, para saque de R$ "+valor+"! Seu saldo é de R$ "+conta.getSaldo() );
        }
    }
}
