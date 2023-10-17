import java.util.Scanner;

public class Ejercicio2 {
    //pedir el dia,mes,año de una fecha e indicar si la fecha es correcta. (todos los meses 30 dias)
    public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);
        System.out.println("Escriba su día");
        int dia = 0;
        dia = fecha.nextInt();
        System.out.println("Escriba su mes");
        int mes = 0;
        mes = fecha.nextInt();

        switch (dia) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30:
                System.out.println("dia correcto");
                break;
            default:
                System.out.println("el dato introducido no pertenece a un dia correcto");
        }
                switch (mes){
                    case 1,2,3,4,5,6,7,8,9,10,11,12:
                        System.out.println("mes correcto");
                        break;
                    default:
                        System.out.println("el mes introducido no es correcto");
                        fecha.close();
                }

    }

}
