package Estcondicional;

import java.util.Scanner;

public class Ejercicio418 {
    
    static Scanner leerT=new Scanner(System.in);
    private static Object hayMas;
    private static int cantVC1;
    private static double precioVC1;
    private static double impVC1;
    private static int cantVC2;
    private static double precioVC2;
    private static double impVC2;
    private static int cantVC3;
    private static double precioVC3;
    private static double impVC3;
    private static int index;

    public static void impuestoVeiculos418() {
        String claveV;
        int cantVc1, cantVc2, cantVc3;
        double precioVc1=0, precioVc2=0, precioVc3=0, impVc1=0, impVc2=0, impVc3=0, totalImpV=0;

        while (hayMas.equals("S")) {
            System.out.println("Ingrese la clave del Vehiculo (VC1,VC2,VC3):");
            claveV=leerT.next().toUpperCase();
            if (claveV.equals("VC1")) {
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC1=leerT.nextInt();
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC1=leerT.nextDouble();
                impVC1=precioVC1*0.10;
            }else if (claveV.equals("VC2")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC2=leerT.nextInt();
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC2=leerT.nextDouble();
                impVC2=precioVC2*0.07;                
            }else if(claveV.equals("VC3")){
                System.out.println("Ingres cantidad de Vehiculo con clave "+claveV+":");
                cantVC3=leerT.nextInt();
                System.out.println("Ingres el precio del Vehiculo con clave "+claveV+":");
                precioVC3=leerT.nextDouble();
                impVC3=precioVC3*0.05;   
            }else{ System.out.println("La clave de vehiculo es incorrecto"); }
            System.out.println("hay mas vehiculos?: s=SI, n=NO");
            hayMas=String.valueOf(leerT.next().toUpperCase().charAt(0));

            System.out.println("Impuesto de Vehiculo VC1 es:"+impVC1);
        System.out.println("Impuesto de Vehiculo VC2 es:"+impVC2);
        System.out.println("Impuesto de Vehiculo VC3 es:"+impVC3);

        System.out.println("Impuesto Total de Vehiculo VC1 es:"+(impVC1*cantVC1));
        System.out.println("Impuesto Total de Vehiculo VC2 es:"+(impVC2*cantVC2));
        System.out.println("Impuesto Total de Vehiculo VC3 es:"+(impVC3*cantVC3));        

        totalImpV=(impVC1*cantVC1)+(impVC2*cantVC2)+(impVC3*cantVC3);
        System.out.println("Total impuesto a pagar de "+(cantVC1+cantVC2+cantVC3)+" es:"+totalImpV);
        }
    
    }
    public static void main(String[] args) {
        impuestoVeiculos418();
    }
}
