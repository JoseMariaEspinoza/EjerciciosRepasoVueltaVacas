package com.corenetwork.modelo;

public class Campos {
    protected double valor;

    public double muestra(){
        return valor;
    }
    public double incrementa(){
        ++valor;
        return valor;
    }
    public double incrementa(double incremento){
        valor += incremento;
        return valor;
    }

    public Campos() {
    }

    public Campos(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
