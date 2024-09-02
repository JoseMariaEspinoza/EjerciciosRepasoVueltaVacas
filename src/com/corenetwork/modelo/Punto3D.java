package com.corenetwork.modelo;

public class Punto3D extends Punto {
    protected int z;

    @Override
    public String toString() {
        return "Punto3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                "} ";
    }

    public Punto3D() {
    }

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
