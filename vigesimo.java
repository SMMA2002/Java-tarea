import java.util.Scanner;

public class vigesimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long f = 1;
        int n;

        System.out.print("Ingresá un número: ");
        n = entrada.nextInt();

        for (int i = n; i > 0; i--) {
            f = f * i;
        }
        System.out.println("El factorial de  " + n + " es: " + f);
    }
}
