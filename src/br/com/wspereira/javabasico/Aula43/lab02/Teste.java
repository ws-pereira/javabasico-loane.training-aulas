package br.com.wspereira.javabasico.Aula43.lab02;

public class Teste {

    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica();
        p1.setCpf("11111111111");
        p1.setNome("Wanderson Pereira");
        p1.setRendaBruta(10000);
        
        PessoaJuridica p2 = new PessoaJuridica();
        p2.setCnpj("123456789000");
        p2.setNome("Côco Ralado");
        p2.setRendaBruta(200000);
        
        PessoaFisica p3 = new PessoaFisica();
        p3.setCpf("22222222222");
        p3.setNome("Edilene Pereira");
        p3.setRendaBruta(1000);
        
        PessoaJuridica p4 = new PessoaJuridica();
        p4.setCnpj("987654321000");
        p4.setNome("Pum Fedorento");
        p4.setRendaBruta(300000);
        
        PessoaFisica p5 = new PessoaFisica();
        p5.setCpf("33333333333");
        p5.setNome("Pedro Pereira");
        p5.setRendaBruta(15000);
        
        PessoaJuridica p6 = new PessoaJuridica();
        p6.setCnpj("231546879000");
        p6.setNome("Peido silencioso");
        p6.setRendaBruta(1000000);
        
        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for(Contribuinte c : contribuintes){
            System.out.println(c);
        }
    }
}
