package Estcondicional;

import java.util.Scanner;
import java.util.logging.LogManager;

public class Ejerciciosvarios2 {
    
    static Scanner leerT=new Scanner(System.in);

    public static BigInteger factorialNumBig(int n) {        
        BigInteger result=new BigInteger("1");
        if(n>1){
        for (int i = 1; i <=n; i++) {
            result= result.multiply(new BigInteger(String.valueOf(i)));
            }
        }       
        return result;
    }    



    public static void main(String[] args) {
        /*factorialXnum();
        Long resultado=factorialNum(5);
        System.out.print("Resultado:"+resultado);*/
        System.out.println("ingrese un numero");
        int numero=leerT.nextInt();
        for (int i = 1; i <=numero; i++) {
        System.out.print("factorial de "+1+" =" +factorialNumBig(i));       
        }
            
        }
    }

