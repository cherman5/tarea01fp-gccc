package TareaProgramacion;

import java.util.Scanner;

/**
 * Ejercicio26
 */
public class Ejercicio26 {

    private static char[] numero;
    private static int es;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        int cont=0, num1=1;
        
        System.out.println("ingrese un numero");
        
        num1=sc.nextInt();
        
        for (cont=num1; cont<=num1+5; cont++){
        
        System.out.println(cont+"el cuadrado es "+cont*cont+"el cubo es" +cont*cont*cont);
        
        }
        
        }
}