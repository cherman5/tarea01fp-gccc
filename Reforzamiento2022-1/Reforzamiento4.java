/**
 * Reforzamiento4
 */
public class Reforzamiento4 {

    static Scanner leerT=new Scanner(System.in);
    //Pregunta 01 Reforzamiento
    private static int cont;
    public static void fibonaciN() {
        int nI=0, nS=1, nT;
        System.out.println("Introduce un numero:");
        int n=leerT.nextInt();
        int cont=1;
        if(n>1){
        while (cont<n) {            
            nT=nS+nI;                        
            nI=nS;
            nS=nT; 
            cont++; 

        }        
    }else{nS=n;}
    System.out.println("el fibonacide "+n+" es:"+nS);
    
}
}
}