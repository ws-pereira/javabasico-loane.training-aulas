package br.com.wspereira.javabasico.Aula37.ExercAula;

public class Aluno extends Pessoa{

    private String matricula;
    private double[] notas;
    private Endereco endereco;



    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /*public String obterInfo{

        String dados = "Matricula - "+ getMatricula();
        dados += "Nome - "+ getNome();
         return dados;

    }*/

    public double calcularMedia(){
        return 0;
    }

    public boolean verificarAprovado(){
        return true;
    }
}
