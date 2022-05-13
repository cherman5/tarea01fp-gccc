package Pregunta2;

import javafx.scene.image.ImageView;

public class Pregunta2 {

}
static Scanner leerteclado=new Scanner(System.in);{
}
     public static void Pregunta2() {
        //definir variables
        double precio=500;
        if(artefactosArt>=2000); {
            artefactosArt=precioArt-descuento*0.10;
        }else if(precioArt>=1000){
            artefactosArt=precioArt-descuento*0.5;
        }else(precioArt>=500){
            artefactosArt=precioArt-descuento*0.2;
        //Datos de entrada
        System.out.println("ingresar el monto:");
        IGV=nextDouble();
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
        Pregunta2();
    }
}