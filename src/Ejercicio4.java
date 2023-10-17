import java.util.Scanner;

public class Ejercicio4 {
    //Pedir dia,mes y año de una fecha correcta y mostrar la fecha del dia siguiente.
    //todos los meses de 30 dias
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
                ++dia;
                if (dia >30) {
                    System.out.println("Fecha de mañana ->" + (dia = 1)+'/'+ ++mes);

                }else {
                    System.out.println("Fecha de mañana ->" + dia +"/"+ mes);
                }
                break;
            default:
                System.out.println("un mes no puede tener estos dias");

                switch (mes) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                        System.out.println("Mes actual");
                        break;
                    default:
                        System.out.println("Solo hay 12 meses en un año");




                        }
                }
                fecha.close();

        }
    }

