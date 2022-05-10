package Estcondicional;

import java.util.Scanner;

/**
 * EjercicioCondmult
 */
public class EjercicioCondmult {

    public static void profesor() {
        System.out.println("la funcion del docente es enseñar");
    }
    public static void estudiante() {
        System.out.println( "la funcion del estudiante es aprender");
    }

    public void maquinapc() {
        System.out.println("la funcion de la pc es procesar imformacion");
    }
    public static void proyector() {
        System.out.println("proyectar una imagen, informacion");
    }

    public static void main(String[] args) {
      EjercicioCondmult objx=new EjercicioCondmult();
        
      Scanner lt=new Scanner(System.in);
     
      System.out.println("ingrese el algoritmo que  desea probar\n1=profesor"+
      "\n2=Estudiante\n3=maquina\n4proyector");    
         int opcMet=lt.nextInt();
        switch (opcMet) {
             case 1: { profesor(); } break;
             case 2:  estudiante(); break;
             case 3:  objx.maquinapc(); break;
             case 4:  objx.proyector(); break;

             default: System.err.println("opcion no existe"); break;
         }
        }
    }
