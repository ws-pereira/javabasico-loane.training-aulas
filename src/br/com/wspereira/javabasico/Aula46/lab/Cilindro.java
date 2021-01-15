package br.com.wspereira.javabasico.Aula46.lab;

public class Cilindro extends Figura3D {

    private double raio;
    private double altura;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * (raio * raio) * altura;
    }

    @Override
    public double calcularArea() {
        double areaBase = Math.PI * Math.pow(raio,2);
        double areaLateral = 2 * Math.PI * altura;
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;

    }
}
