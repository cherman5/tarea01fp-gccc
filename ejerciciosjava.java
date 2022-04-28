 import java.util.Scanner;

/**
 * ejerciciosjava
 */
public class ejerciciosjava {

    public static void main(String[] args) {
        //2.15
        //definir variables
        double p, r=4, i;
        //datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese el valor de intensidad:");
        i=lt.nextDouble();
        //proceso
        p=r*Math.pow(i, 2);
        //datos de salida
        System.out.println("la potencia es:"+p);
        lt.close();

    }
}