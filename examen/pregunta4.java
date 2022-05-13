package examen;

public class pregunta4 {   
}
static Scanner leerteclado=new Scanner();
public static void pregunta4() {
    //definir veriables
    double a, b, c;
    String vacuna;
    System.out.println("ingrese el tipo de vacuna:");
    Object nv = leerteclado.nextDouble();
    //proceso
}   /*
    >70 sin inportar el sexo se le aplica el tipo c
    =16 y 69 y es mujer se le aplica el tipo B y se es hombre la A
    <16 se aplica el tipo A sin importar el sexo
    */
    String vacuna;
    private String estado;
    if(edad>70){
        String estado="se le aplica el tipo C";
    }else if(edad=16 && edad=69){
        estado="se aplica el tipo B y si es hombre se aplica la A";
    }else if(edad<16){
        estado="se aplica sin impotar el sexo";
    }
    //datos de salida
    System.out.println(edad);
    public static void main(String[] args) {
     pregunta4();  
    }