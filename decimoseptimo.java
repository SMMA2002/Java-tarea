
import java.util.Scanner;

public class decimoseptimo {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int valor = 0;
            int menor = 2147483647;
            int entero;
            System.out.print("Cantidad de valores: ");
            valor = entrada.nextInt();

            for (int cuenta = 1; cuenta <= valor; cuenta++) {
                System.out.printf("Entero # %d%s", cuenta, ": ");
                entero = entrada.nextInt();
                if (entero < menor)
                    menor = entero;
            }
            System.out.printf("%s%d%n", "El menor es: ", menor);
        }
    }
}