package com.corenetwork.modelo;

public class Cuenta {
    protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public void extraer(double cantidad){
        saldo -= cantidad;
    }

    public void ingresar(double cantidad){
        saldo += cantidad;
    }

    public double obtenerSaldo(){
        return saldo;
    }
}
