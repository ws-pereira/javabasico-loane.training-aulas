package br.com.wspereira.javabasico.Aula52;

public class UsandoMinhaException {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 15,6, 32, 21, 64, 128};
        int[] denomidaores = {2, 0, 4, 8, 0, 2, 4};


        for (int x = 0; x < numeros.length; x++) {
            try {
                if(numeros[x] % 2 !=0){
                    throw new DivisaoNaoExata(numeros[x],denomidaores[x]);
                }
                System.out.println(numeros[x] + " / " + denomidaores[x]
                        + " = " + (numeros[x] / denomidaores[x]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) { // Só pode fazer esse recursfo, somente a partir do Java 7
                System.out.println("Aconteceu um erro");
                e.printStackTrace();
            }

        }

    }
}
