package br.com.wspereira.javabasico.Aula37.ExercAula;

public class Professor extends Pessoa{

    private double salario;
    private Curso nomeCurso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Curso getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(Curso nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
