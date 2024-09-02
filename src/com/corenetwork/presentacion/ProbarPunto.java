package com.corenetwork.presentacion;

import com.corenetwork.modelo.Punto;
import com.corenetwork.modelo.Punto3D;

public class ProbarPunto {
    public static void main(String[] args) {
        Punto3D p = new Punto3D(0,0,5);
        Punto p1 = new Punto3D(0,5,10);
        Punto3D p2 = (Punto3D) p1;
        p2.setZ(15);
        System.out.println(p2.toString());

    }
}
