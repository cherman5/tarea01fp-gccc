import java.util.Scanner;

/**
 * Reforzamiento
 */
public class Reforzamiento {

    private static String primeraParteM;
    private static String mensaje;
    public static void mostrarcursodia() {
        //Datos variable
        int diaSem;
        String primeraParteM="ese dia toca el curso de:";
        //leer datos 
        Scanner leerT=new Scanner(System.in);
    
    System.out.println("Ingrese un dia de la samana:\n1=Dom\n2=Lun\n3=Mar\n4=Mie\n5=Jue\n6=Vie\n7=Sab");
    diaSem=leerT.nextInt();
    //Proceso 
    mensaje="No hay clases";
    if (diaSem==1 || diaSem==7) {
    }else if(diaSem==2) {
        mensaje=primeraParteM+"Matematica";
    }else if(diaSem==3 || diaSem==5) {
        mensaje=primeraParteM+"Fundamentos de progracion";
    }else if(diaSem==4) {
        mensaje=primeraParteM+"Capacidades comunicativas";
    }else if(diaSem==6) {
        mensaje=primeraParteM+"introduccion a la ingenieria de sistemas";
    }else{
        mensaje="El dia que coloco no exixte";
    }
    //Datos de salida
    System.out.println("ese dia toca el curso de: "+mensaje);
    }
    public static void main(String[] args) {
        mostrarcursodia();
    }
}