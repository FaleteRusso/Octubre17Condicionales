import java.util.Scanner;

public class Ejercicio6 {
    //Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo 56, mostrar cincuenta y seis...
    public static void main(String[] args) {
        //1. declarar varibles
        int num,unidades, decenas;
        //2.

        Scanner tecladoNumerico = new Scanner(System.in);
        num = tecladoNumerico.nextInt();
        //solicita el dato por consola
        System.out.println("Escriba su número maximo de dos cifras");


        //3. validar que sea de 2 cifras
        if (num <0 || num >99) {
            System.out.println("el numero no es valido");
        } else {
            unidades = num % 10;
            decenas = num / 10;
            switch (decenas){
                case 1:
                    System.out.println("Diez");
                    break;
                case 2:
                    System.out.println("Veinte");
                    break;
                case 3:
                    System.out.println("Treinta");
                    break;
                case 4:
                    System.out.println("Cuarenta");
                    break;
                case 5:
                    System.out.println("Cincuenta");
                    break;
                case 6:
                    System.out.println("Sesenta");
                    break;
                case 7:
                    System.out.println("Setenta");
                    break;
                case 8:
                    System.out.println("Ochenta");
                    break;
                case 9:
                    System.out.println("Noventa");
                    break;
            }
            if (decenas !=0 &&unidades !=0){
                System.out.println(" y ");
            }

        }
       ;
        switch (num){
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;



        }
    }
}
