package br.com.wspereira.javabasico.Aula46.lab;

public class Circulo extends Figura2D implements DimensaoSuperficial{

     private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}
