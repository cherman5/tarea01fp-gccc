package examen;

/**
 * pregunta4
 */
public class pregunta4 {

static void pregunta4() {
    //declaricio de varible e inicializacion
    int edad = 0;
    char sexo;
    //datos de entradaedad = sc.nextint
    System.out.println("ingrese su edad: ");
    edad = Sc.nextInt();
    do{
    System.out.println("ingrese su sexo, M(Masculino) o F(Femenino):");
    sexo = Sc.next().charAt(0);  
    }while(sexo !='F' && sexo !='M');
    //proceso
    if (edad>= 70){
    System.out.println("usted se debe aplicar la vacuna tipo C");
    } else if (edad >= 16 && edad < 70 && sexo --'F'){
    System.out.println("usted se debe aplicar la vacuna tipo B");
    } else if (edad>= 16 && edad <70 && sexo --'M'){
    System.out.println("usted se debe aplicar la vacuna tipo A");
    } else if (edad < 16){
    System.out.println("se le aplica la vacua tipo A");
    
    }       
    
    public static void main(String[] args) {
        pregunta4();
    }