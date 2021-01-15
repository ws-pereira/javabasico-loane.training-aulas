package br.com.wspereira.javabasico.Aula46.lab;

public class Cubo extends Figura3D implements DimensaoVolumetrica{

    private int lado;


    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(lado,2);
    }


    @Override
    public double calcularVolume() {
        return Math.pow(lado,3);
    }
}
