public class CondicionalSwitch {
    public static void main(String[] args) {
        char estadoCivil ='s';

        switch (estadoCivil){
            case 'C' ,'c':

                System.out.println("Casado");
                break;
            case 'D':
            case 'd':
                System.out.println("Divorciado");
                break;
            case'S', 's':
                System.out.println("Soltero");
                break;
            case 'V':
            case 'v':
                System.out.println("Viudo");
                break;
            default:
                System.out.println("El valor es invalido");
        }

    }
}
