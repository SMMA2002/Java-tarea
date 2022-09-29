import java.util.Scanner;

public class segundo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;

        System.out.print("Ingrese los dos numero:\n");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("El primer numero es mayor que el segundo");
        } else {
            System.out.println("El primer numero es menor que el segundo");
        }
    }
}
