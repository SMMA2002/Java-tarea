import java.util.Scanner;

public class decimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.print("Ingrese un numero: ");
        n = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            // System.out.print(" x " + i + " = " + n * i + "\n");
            System.out.printf("%s%s%s", +n, " x ", +i + " = " + n * i + "\n");
        }
    }

}
