package com.corenetwork.presentacion;

import com.corenetwork.modelo.TablaMultiplicar;

import java.util.Scanner;

public class ProbarTabla {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indique el numero del que quiere conocer la tabla");
        TablaMultiplicar tm = new TablaMultiplicar(entrada.nextInt());
        System.out.println(tm.mostrarTabla());
    }
}
