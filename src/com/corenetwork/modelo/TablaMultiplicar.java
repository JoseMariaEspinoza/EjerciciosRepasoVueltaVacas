package com.corenetwork.modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TablaMultiplicar {
    protected int num;

    public String mostrarTabla(){
        String tabla = "--- Tabla del " + num + " ---\n";
        for(int i=1; i <= 10; i++){
            int resultado = num*i;
            tabla += num + " x " + i + " = " + resultado + "\n";
        }

        return tabla;
    }

    public TablaMultiplicar() {
    }

    public TablaMultiplicar(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
