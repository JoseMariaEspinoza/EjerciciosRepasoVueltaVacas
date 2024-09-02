package com.corenetwork.modelo;

public class CuentaLimite extends Cuenta{
    protected double limite;

    public CuentaLimite(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    public CuentaLimite(double limite) {
        this.limite = limite;
    }

    public CuentaLimite() {
    }

    @Override
    public void extraer(double cantidad) {
        super.extraer(cantidad);
    }

    public void ajustarLimite(){
        limite = saldo/2;
    }

}
