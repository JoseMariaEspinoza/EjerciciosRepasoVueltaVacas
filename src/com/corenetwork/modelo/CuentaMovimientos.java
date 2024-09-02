package com.corenetwork.modelo;

import java.util.ArrayList;

public class CuentaMovimientos extends CuentaLimite{
    protected ArrayList<Movimientos> movimientos;

    public CuentaMovimientos(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public ArrayList<Movimientos> obtenerMovimientos(){
        return movimientos;
    }

    @Override
    public void extraer(double cantidad) {
        super.extraer(cantidad);
    }

    @Override
    public void ingresar(double cantidad) {
        super.ingresar(cantidad);
    }

    public ArrayList<Movimientos> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimientos> movimientos) {
        this.movimientos = movimientos;
    }
}
