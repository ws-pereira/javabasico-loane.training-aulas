package br.com.wspereira.javabasico.Aula48;

public class MultiplosCatch7 {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denomidaores = {2, 0, 4, 8, 0};


        for (int x = 0; x < numeros.length; x++) {
            try {
                System.out.println(numeros[x] + " / " + denomidaores[x]
                        + " = " + (numeros[x] / denomidaores[x]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e1) { // Só pode fazer esse recursfo, somente a partir do Java 7
                System.out.println("Erro inexperado");
            }

        }
    }
}
