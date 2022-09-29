import java.util.Scanner;

public class quinto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero \n ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.print("El numero es par ");
        } else {
            System.out.print("El numero es impar ");
        }
    }
}
