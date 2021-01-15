package br.com.wspereira.javabasico.Aula43.lab02;

import br.com.wspereira.javabasico.Aula43.lab01.ContaPoupanca;

public class PessoaJuridica extends Contribuinte {

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return super.toString()
                +" - CNPJ - "+cnpj
                +" - Imposto a ser pago R$ "+ calcularImposto();
    }
}
