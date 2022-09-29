import java.util.Scanner;

public class vigesimoprimero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d, st, t;

        System.out.print("Ingrese cuantos ventas hizo del producto A: ");
        a = entrada.nextLong();

        System.out.print("Ingrese cuantos ventas hizo del producto B: ");
        b = entrada.nextLong();

        System.out.print("Ingrese cuantos ventas hizo del producto C: ");
        c = entrada.nextLong();

        System.out.print("Ingrese cuantos ventas hizo del producto D: ");
        d = entrada.nextLong();

        st = (a * 239.99) + (b * 129.75) + (c * 99.95) + (d * 350.89);

        t = 200 + st * 0.09;

        System.out.print("Su pago total es: " + t);

    }
}
