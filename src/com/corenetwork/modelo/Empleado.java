package com.corenetwork.modelo;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected final double PORCENTAJE = 0.75;

    public double calcularNomina(){
        return sueldo*PORCENTAJE;
    }

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
