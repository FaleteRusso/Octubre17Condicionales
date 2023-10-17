import java.util.Scanner;

public class Ejercicio3 {
    //Pedir dia,mes y año de una fecha e indicar si la fecha es correcta con meses de 28,30,31 dias
    // Sin años bisiestos
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba su día");
        int dia = 0;
        dia = teclado.nextInt();
        System.out.println("Escriba su mes");
        int mes = 0;
        mes = teclado.nextInt();

        switch (mes) {
            case 4, 6, 9, 11:
                if (dia >= 1 && dia <= 30) {
                    System.out.println("la fecha es correcta");
                } else {
                    System.out.println("la fecha no está en el rango");
                }
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia >= 1 && dia <= 31) {
                    System.out.println("La fechas es correcta");
                } else {
                    System.out.println("La fecha no está en el rango");
                }
                break;
            case 2:
                if (dia >= 1 && dia <= 28) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha no está en el rango");
                }
                break;
            default:
                System.out.println("no está en el rango de 1 a 12");
                teclado.close();


        }
    }
}