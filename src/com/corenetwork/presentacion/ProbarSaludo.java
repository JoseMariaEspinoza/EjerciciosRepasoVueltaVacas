package com.corenetwork.presentacion;

import com.corenetwork.modelo.Saludo;

public class ProbarSaludo {
    public static void main(String[] args) {
        Saludo s = new Saludo("Buenos Dias!! A Por Todas");
        System.out.println(s.saludar());
    }

}
