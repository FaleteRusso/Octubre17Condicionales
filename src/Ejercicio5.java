import java.util.Scanner;

public class Ejercicio5 {
    //pedir una nota numerica entera en 0 y 10, y mostrar dicha nota de forma: cerp,uno,dos...
    public static void main(String[] args) {
        Scanner notaExamen = new Scanner(System.in);
        System.out.println("Escriba su nota en número");
        int calificacion = 0;
        calificacion = notaExamen.nextInt();
        switch (calificacion){
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
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("el numero introducido no esta en la escala de 0 a 10");
                notaExamen.close();

        }

    }
}