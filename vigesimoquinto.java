import java.util.Scanner;

public class vigesimoquinto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        int d = 2;
        System.out.print("Cuantos multiplos quiere ver: ");
        n = entrada.nextInt();

        System.out.println(d);
        for (int c = 1; c <= n; c++) {

            d += 2;

            System.out.println(d);

        }
    }
}
