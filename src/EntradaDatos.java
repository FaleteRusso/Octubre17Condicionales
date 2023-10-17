import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //2. Declaracion de variables - primarias o instancia
        int numero; //primitiva
        Scanner tecladoEntrada = new Scanner(System.in); //instancia
        System.out.println("Escriba un numero ->");
        numero = tecladoEntrada.nextInt();
        System.out.println("El numero que se leyó fué ->" + numero);
        //reciebiendo por consola el sueldo
        double sueldo;
        System.out.println("escriba un sueldo");
        sueldo = tecladoEntrada.nextDouble();
        System.out.println("El numero que se leyó fué ->" + sueldo);
    }
}
