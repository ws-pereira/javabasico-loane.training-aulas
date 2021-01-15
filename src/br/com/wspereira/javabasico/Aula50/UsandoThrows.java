package br.com.wspereira.javabasico.Aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args)  {

        System.out.print("Digite um número decimal: ");
        try{
            double numero = lerNumero();
            System.out.println("Você digitou "+ numero);
        }
        catch(Exception e){
            System.out.println("Entrada inválida");
            e.printStackTrace();

        }

    }

    public static double lerNumero() throws Exception{
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num;
    }

}
