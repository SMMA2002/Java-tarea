/*) a) if (edad >= 65);
System.out.println(“Edad es mayor o igual que 65”);
else
System.out.println(“Edad es menor que 65)”;

 */

import java.util.Scanner;

public class decimocuarto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int edad;
        System.out.printf("\nIngrese su edad: ");
        edad = entrada.nextInt();

        if (edad >= 65)
            System.out.println("Edad es mayor o igual que 65");
        else
            System.out.println("Edad es menor que 65");

    }
}
