package com.corenetwork.presentacion;

import com.corenetwork.modelo.Empleado;
import com.corenetwork.modelo.Gerente;
import com.corenetwork.modelo.Operador;
import com.corenetwork.modelo.Vendedor;

public class ProbarEmpleado {
    public static void main(String[] args) {
        Empleado e2 = new Gerente("Jose",1500,600);
        Empleado e3 = new Vendedor("Julio",1500,25000,0.025);
        Empleado e4 = new Operador("Jacinta",1500,1500,0.04);
        System.out.println("El sueldo del Gerente es ---> " +e2.calcularNomina() + "€");
        System.out.println("El sueldo del Vendedor es ---> " +e3.calcularNomina() + "€");
        System.out.println("El sueldo del Operador es ---> " +e4.calcularNomina() + "€");
    }
}
