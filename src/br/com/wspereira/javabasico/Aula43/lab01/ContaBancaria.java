package br.com.wspereira.javabasico.Aula43.lab01;

public class ContaBancaria {

    private String numConta;
    private String nomeCliente;
    private double saldo;



    public ContaBancaria() {
        this.numConta = numConta;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean validaSaldo(){
        if(getSaldo() <= 0.00){
            return false;
        }
        return true;
    }

    public boolean sacarValor(double valor){
        if(saldo > valor) {
            saldo -=valor;
            return true;
        }
        return false;
    }

    public void depositarValor(double valor){
        saldo +=valor;
    }

    @Override
    public String toString() {
        return  "Conta - " + numConta +
                ", Cliente - " + nomeCliente +
                ", saldo - R$ " + saldo;
    }
}
