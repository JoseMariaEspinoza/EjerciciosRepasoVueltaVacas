package com.corenetwork.presentacion;

import com.corenetwork.modelo.Campos;

public class ProbarCampos {
    public static void main(String[] args) {
        Campos c = new Campos(5);
        c.incrementa();
        c.incrementa(5);
        System.out.println("El valor del campo es ---> " + c.muestra());
    }
}
