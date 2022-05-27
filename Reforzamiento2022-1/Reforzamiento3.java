/**
 * Reforzamiento3
 */
public class Reforzamiento3 {

    static Scanner leerT=new Scanner(System.in);
    //Pregunta 01 Reforzamiento
    public static void serieFibonaci() {
        int nI=0, nS=1, nT;
        System.out.println("Introduce el N numero:");
        int n=leerT.nextInt();
        System.out.println(nI);
        int cont=1;
        while (cont<n) {  
            System.out.println(nS);              
            nT=nS+nI;                        
            nI=nS;
            nS=nT; 
            cont++; 

        }        
    }
    public static void main(String[] args) {
        serieFibonaci();




    }
}
}