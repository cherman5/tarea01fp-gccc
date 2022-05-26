package subporgramas;

import java.util.Scanner;

public class ClaseGeneral {

  static Scanner leerT=new Scanner(System.in);
  static Aritmetica obj=new Aritmetica();
  static Persona objP=new

  public static void main(String[] args) {
    System.out.println("ingrese el pimer valor");
    int aX=leerT.nextInt();
    System.out.println("ingrese el siguente valor");
    int bX=leerT.nextInt();
    int result=obj.sumar(bX, bX);
    System.out.println("la suma es:"+result);

System.out.println("ingrese un comida");
    objP.comer(leerT.next());
  }
  }




