package Estcondicional;

import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;



/**
 * Ejercicios31
 */
public class Ejercicios31 { 
static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //declarar variable
        int edad;
        String mensaje;
        //datos de entrada
        System.out.println("Ingrese la edad:");
        edad=lt.nextInt();
        if (edad>=18) {
            mensaje="puede votar porque su edad es " +edad;
        } else {
            mensaje="no puede votar porque su edad es "+edad;
        }
        //datos de entrada
        System.out.println(mensaje);
    }
}