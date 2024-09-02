package com.corenetwork.presentacion;

import com.corenetwork.modelo.Cuadrado;
import com.corenetwork.modelo.Figura;
import com.corenetwork.modelo.Triangulo;

public class ProbarFigura {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(0);
        cPeque.setY(0);
        cPeque.setLado(10);
        Figura cMediano = new Cuadrado(10,0,20);
        Triangulo tPeque = new Triangulo();
        tPeque.setX(0);
        tPeque.setY(25);
        tPeque.setBase(10);
        tPeque.setAltura(7);
        Figura tMediano = new Triangulo(10,25,20,14);
        Figura[] figuras = {cPeque,cMediano,tPeque,tMediano};
        for(Figura elemento: figuras){
            System.out.println(elemento.getClass() + " ---> " + elemento.calcularArea());
        }
    }
}
