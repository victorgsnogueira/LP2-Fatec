package br.edu.fatec;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl shapeFactory = new ShapeFactoryImpl();



        Calculable square = shapeFactory.getShape(ShapeType.SQUARE, new Double[] {5.0});
        Calculable circle = shapeFactory.getShape(ShapeType.CIRCLE, new Double[] {5.0});
        Calculable cube = shapeFactory.getShape(ShapeType.CUBE, new Double[] {5.0});
        Calculable triangle = shapeFactory.getShape(ShapeType.TRIANGLE, new Double[] {5.0, 3.0});
        Calculable rectangle = shapeFactory.getShape(ShapeType.RECTANGLE, new Double[] {5.0, 2.0});
        Calculable trapezo = shapeFactory.getShape(ShapeType.TRAPEZO, new Double[] {5.0, 2.0, 3.0});
        Calculable parallelogram =  shapeFactory.getShape(ShapeType.PARALLELOGRAM, new Double[] {5.0, 4.3});
        Calculable hexagon = shapeFactory.getShape(ShapeType.HEXAGON, new Double[] {5.0});
        Calculable diamond = shapeFactory.getShape(ShapeType.DIAMOND, new Double[] {5.0, 3.0});

        System.out.printf("a area do quadrado é: %.2f%n", square.calcularArea());
        System.out.printf("a area do circulo é: %.2f%n", circle.calcularArea());
        System.out.printf("a area do cubo é: %.2f%n", cube.calcularArea());
        System.out.printf("a area do triangulo é: %.2f%n", triangle.calcularArea());
        System.out.printf("a area do retangulo é: %.2f%n", rectangle.calcularArea());
        System.out.printf("a area do trapezio é: %.2f%n", trapezo.calcularArea());
        System.out.printf("a area do paralelogramo é: %.2f%n", parallelogram.calcularArea());
        System.out.printf("a area do hexagono é: %.2f%n", hexagon.calcularArea());
        System.out.printf("a area do diamante é: %.2f%n", diamond.calcularArea());
    }
}