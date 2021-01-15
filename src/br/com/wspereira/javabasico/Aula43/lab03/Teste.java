package br.com.wspereira.javabasico.Aula43.lab03;


public class Teste {

    public static void main(String[] args) {

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento("150  cm");
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2.0);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento("300 cm");
        tubarao.setAmbiente("Mar");
        tubarao.setCor("Cinzenta");
        tubarao.setVelocidade(1.5);
        tubarao.setCaracteristica("Barbatanas e Caldas");

        Mamifero urso = new Mamifero();
        urso.setNome("Urso do Canada");
        urso.setComprimento("180 cm");
        urso.setCor("Vermelho");
        urso.setAmbiente("Terra");
        urso.setVelocidade(0.5);
        urso.setAlimento("Mel");

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println(" ------------------------------- ");
        for (Animal animal : animais){
            System.out.println(animal);
            System.out.println(" ------------------------------- ");
        }

    }
}
