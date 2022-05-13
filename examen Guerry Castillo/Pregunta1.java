  package examen;

import java.util.Scanner;

/**
   * Pregunta1
   */
  public class Pregunta1 {
    //comentario
    static Scanner leerteclado=new Scanner(System.in);

    public static void Pregunta1() {
        //Definir variable
        double n1, n2, n3, promedio;
        String nivel;
        //Datos de entrada
        System.out.println("ingrese nota de conocimiento:");
        n1=leerteclado.nextDouble();
        System.out.println("ingrese nota de entrevista personal:");
        n2=leerteclado.nextDouble();
        System.out.println("ingrese nota de test psicologuico:");
        n3=leerteclado.nextDouble();
        //proceso
        promedio=n1*0.40+n2*0.35+n3*0.25;
        /* >=17 aprobo nivel 4, <17 y >=14 aprobo con el nivel 3, <14 y >=11 aprobo con el nivel 2, <11 no puede obtener la vacante
        */
        String estado;
        if (promedio>=17) {
            estado="aprobo con el nivel 4";  
        }else if(promedio<17 && promedio>14){
            estado="aprobo con el nivel 3";
        }else if(promedio<14 && promedio>11){
            estado="aprobo con el nivel 2";
        }else{
            estado="no puede obtener la vacante";
        }
        // Datos de salida
        System.out.println(estado);
  }

 
    public static void main(String[] args) {
        Pregunta1();
    }

  }