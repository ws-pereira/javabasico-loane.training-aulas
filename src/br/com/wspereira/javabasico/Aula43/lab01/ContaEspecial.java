package br.com.wspereira.javabasico.Aula43.lab01;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean sacarValor(double valor){

        double saldoComLimite = getSaldo() + limite;

        if(saldoComLimite > valor) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Limite - R$ "+limite
        +" - "+super.toString();
    }
}
