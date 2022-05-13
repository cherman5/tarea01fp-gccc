package examen;

public class Pregunta2 {

}
static Scanner leerteclado=new Scanner(System.in);
public static void pregunta2() {
    //definir variables
    double precio=500;
    if(precioArt>2000); {
        precioArt=precioArt-precioArt*0.10;
    }else if(precioArt>=1000){
        precioArt=precioArt-precioArt*0.5;
    }else(precioArt>=500){
        precioArt=precioArt-precioArt*0.2;
        //Datos de entrada
        System.out.println("ingresar el monto:");
        igv=leerteclado.nextDouble();
        //proceso
        /*
        >=2000 el descuento de IGV es de un 10%
        >=1000 el descuento de IGV es de un 5%
        >=500 el decuento de IGV es de un 2%
        */
        String estado;
        if(precio>=2000){
            estado="el descuento de IGV es de un 10%";
        }else if(precio>=1000){
            estado="el descuento de IGV es de un 5%";
        }else if(precio>=500){
            estado="el descuento de IGV es de un 2%";
        }
        //Datos de salida
        System.out.println(estado);
    }
    public static void main(String[] args) {
        pregunta2();
    }
}