package com.corenetwork.modelo;

public class Triangulo extends Figura{
    private double base;
    private double altura;


    @Override
    public double calcularArea() {
        return base*altura;
    }

    public Triangulo() {
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
