import java.util.Scanner;

/**
 * Reforzamiento2
 */
public class Reforzamiento2 {

    private static String saludos;
    private static int horas;

    public static void ejercicio() {
    
    //variables 
    int hora;
    String saludo;
    //Datos de entrada
    Scanner leerT=new Scanner(System.in);
    System.out.println("ingrese la hora");
    hora=leerT.nextInt();
    //proceso
    if (hora>=6 && hora <=12) {
        saludo="buenos dias";
    }else if (hora>=13 && horas<=20) {
        saludo="buenas tardes";
    }else if ((hora>=21 && hora<=23) || (hora>=0 && hora<=5)){
        saludos="buenas noches";
    }else{
        saludo="esa hora no existe";
    }
    //Datos de salida
    System.out.println(saludos);

}

    public static void main(String[] args) {
        ejercicio();
    }
}