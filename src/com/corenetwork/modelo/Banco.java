package com.corenetwork.modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    protected static CuentaMovimientos cuentamov = new CuentaMovimientos(1500,750);
    protected static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int respuesta;String confirmacion;
        do{
            mostrarMenu();
            respuesta = entrada.nextInt();
            switch(respuesta){
                case 1 -> ingresar();
                case 2 -> extraer();
//                case 3 -> System.out.println(cuentamov.obtenerSaldo());
                case 3-> mostrarMovimientos();
            }
            System.out.println("Desea realizar otra operación?");
            confirmacion = entrada.next();}
        while(confirmacion.equalsIgnoreCase("s"));

    }
    private static void mostrarMenu(){
        System.out.println("---Que desea hacer?---\n1. Ingresar\n2. Extraer\n3. Consultar Movimientos");
    }
    private static void ingresar(){
        System.out.println("Introduzca el importe a ingresar");
        double cantidad = entrada.nextDouble();
        cuentamov.ingresar(cantidad);
        cuentamov.setMovimientos(movimientos.ad(new Movimientos("Ingreso", LocalDateTime.now(),cantidad)));

    }
    private static void extraer(){
        System.out.println("Introduzca el importe a retirar");
        cuentamov.extraer(entrada.nextDouble());
    }
     private static void mostrarMovimientos(){
         System.out.println(cuentamov.toString());
     }
}
