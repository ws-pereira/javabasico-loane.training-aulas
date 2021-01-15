package br.com.wspereira.javabasico.Aula43.lab01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;

    public ContaPoupanca() {
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public boolean atualizaSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();
        if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            super.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dia Rendimento - " + diaRendimento+" - "+
                super.toString();
    }




}
