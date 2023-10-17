import java.util.Scanner;

public class Ejercicio1 {
    //Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente,bien...
    public static void main(String[] args) {

        byte notasExamen =7 ;
        switch (notasExamen){
            case 0 ,1 ,2 ,3 ,4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Valor invalido");
        }

    }
}
