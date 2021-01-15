package br.com.wspereira.javabasico.Aula49;

public class TestandoFinally {

    public static void main(String[] args) {

        int[] numeros = {4,8, 16, 32, 64, 128};
        int[] denomidaores = {2, 0, 4, 8,0};


        for(int x = 0; x < numeros.length; x++){
            try {
                System.out.println(numeros[x] + " / " + denomidaores[x]
                        + " = " + (numeros[x] / denomidaores[x]));
            }
            catch(ArithmeticException e1){
                System.out.println("Erro ao dividir por zero");
                System.exit(0); // Pegadinha - finaliza a executado do prg, e o finally não é executado
            }
            catch (ArrayIndexOutOfBoundsException e2){
                System.out.println("Posição do array invalido");
                System.exit(0);
            }
            finally { // sempre é executado
                System.out.println("Essa linha impressa sempre após o try ou catch");
                System.out.println();
            }

            // Throwable - super classe de todos os erros e as excecções do Java, mas não é boa prática
        }

    }
}
