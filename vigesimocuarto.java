import java.util.Scanner;

public class vigesimocuarto {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int n;
        int c = 1;

        while (c <= 5) {

            System.out.print("Escriba un número entre 1 y 60: ");
            n = entrada.nextInt();

            if ((1 <= n) && (60 >= n)) {

                for (int i = 1; i <= n; i++)
                    System.out.print("█");

                System.out.println();

                c++;
            }
        }
    }
}
