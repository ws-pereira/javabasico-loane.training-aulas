package br.com.wspereira.javabasico.Aula36.ExercAula;

public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Wanderson");

        // Releacionemtneo tem um-Endereco
        Endereco endereco = new Endereco();
        contato.setEndereco(endereco);

        endereco.setRua("Rua José Pitanga");
        endereco.setNumero("41");
        endereco.setComplemento("Apto 101");
        endereco.setCidade("Rio de Janeiro");
        endereco.setUf("RJ");
        endereco.setCep("21511-420");

        // Releacionemtneo tem um-Telefone
        Telefone telefone = new Telefone();


        telefone.setTipo("Celular");
        telefone.setDdd("21");
        telefone.setNumero("9 7230-5517");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Celular");
        telefone2.setDdd("21");
        telefone2.setNumero("9 7230-5517");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        contato.setTelefones(telefones);
        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getRua());
        }

        //if(contato != null && contato.getTelefone() != null){
        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd()+ " " + t.getNumero());
            }

        }

    }
}
