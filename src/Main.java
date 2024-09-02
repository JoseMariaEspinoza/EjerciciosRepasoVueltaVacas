import com.corenetwork.modelo.Campos;
import com.corenetwork.modelo.Saludo;
import com.corenetwork.modelo.TablaMultiplicar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Saludo s = new Saludo("Buenos Dias!! A Por Todas");
        System.out.println(s.saludar());

        Campos c = new Campos(5);
        c.incrementa();
        c.incrementa(5);
        System.out.println("El valor del campo es ---> " + c.muestra());


        Scanner entrada = new Scanner(System.in);
        System.out.println("Indique el numero del que quiere conocer la tabla");
        TablaMultiplicar tm = new TablaMultiplicar(entrada.nextInt());
        System.out.println(tm.mostrarTabla());
    }


}