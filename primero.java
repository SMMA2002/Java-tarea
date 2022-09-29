import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float n1, n2, suma, multi, res, divi;

        System.out.print("Ingrese los dos numero:");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();

        suma = n1 + n2;
        multi = n1 * n2;
        res = n1 - n2;
        divi = n1 / n2;

        System.out.println("\n La suma es: " + suma);
        System.out.println("\n La multiplicacion es: " + multi);
        System.out.println("\n La resta es: " + res);
        System.out.println("\n La divicion es: " + divi);

    }
}