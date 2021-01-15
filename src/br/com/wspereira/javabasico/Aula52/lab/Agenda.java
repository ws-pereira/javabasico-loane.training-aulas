package br.com.wspereira.javabasico.Aula52.lab;

import java.util.Arrays;

public class Agenda {

    private Contato[] contatos;

    public Agenda(){
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean agendaCheia = true;
        for(int x = 0; x < contatos.length; x++){
            if(contatos[x] == null){
                contatos[x] = c;
                agendaCheia = false;
                break;
            }
        }
        if(agendaCheia){
            throw new AgendaCheiaException();
        }
    }

    public int consultaContatoPorNome(String name) throws ContatoNaoExisteException {

        for(int x = 0; x < contatos.length; x++){
            if(contatos[x] != null){
                if(contatos[x].getName().equalsIgnoreCase(name)){
                    return x;
                }
            }
        }

        // Lançar exception de contato não existe
        throw new ContatoNaoExisteException(name);

    }

    @Override
    public String toString() {
        String s ="";
        for(Contato c : contatos){
            if(c != null) {
                s += c.toString() + "\n";
            }
        }
        return s;
    }
}
