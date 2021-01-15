package br.com.wspereira.javabasico.Aula48;

public class MultiplosCatchGenerico {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomidaores = {2, 0, 4, 8, 0};


        for (int x = 0; x < numeros.length; x++) {
            try {
                System.out.println(numeros[x] + " / " + denomidaores[x]
                        + " = " + (numeros[x] / denomidaores[x]));
            } catch (ArithmeticException e1) {
                System.out.println("Erro ao dividir por zero");
            } catch (Throwable e2) {  // Captura da exceção genérica
                System.out.println("Ocorreu um erro");
            }
        }
    }
}