package com.corenetwork.modelo;

import java.time.LocalDateTime;

public class Movimientos {
    protected double cantidad;
    protected LocalDateTime fechaHora;
    protected String tipo;

    public Movimientos(String tipo, LocalDateTime fechaHora, double cantidad) {
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.cantidad = cantidad;
    }
}
