package Estcondicional;

import java.util.Scanner;

/**
 * EjercicioVarios
 */
public class EjercicioVarios {

    static Scanner leerT=new Scanner(System.in);

    public static void factorialXnum() {
        int n, result=1; 
        System.out.println("Ingrese un numero:");
        n=leerT.nextInt();
        if(n>1){
        for (int i = 1; i < n; i++) {
            result=result*i; 
            }
        }
        System.out.println("El factorial de "+n+" es:"+result);
    }

    public static void main(String[] args) {
        factorialXnum();
    }
}
