/**
 * Reforzamiento5
 */
public class Reforzamiento5 {

    public static void iaNumeroPrimo() {
        Scanner leerT=new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num=leerT.nextInt();
        int cont=1;
        int cantDiv=0;
        while (cont<=num) {
            if (num%cont==0) {
                cantDiv++;        
            }
            cont++;
        }
        if (cantDiv==2) {
            System.out.println("el numero "+num+"es primo");
        }else {
            System.out.println("el munero "+num+"no es primo");
      }
        
    }
    public static void main(String[] args) {
        iaNumeroPrimo();
    }
}
}