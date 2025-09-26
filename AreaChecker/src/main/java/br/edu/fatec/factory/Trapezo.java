package br.edu.fatec.factory;

final  class Trapezo implements Calculable{
    private double bMaior;
    private double bMenor;
    private double altura;

    Trapezo(double bMaior, double bMenor, double altura) {
        this.bMaior = bMaior;
        this.bMenor = bMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (bMaior + bMenor) * altura / 2;
    }
}
