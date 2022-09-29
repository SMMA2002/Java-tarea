
public class decimonoveno {
    public static void main(String[] args) {
        int total = 1;

        for (int entero = 1; entero <= 15; entero += 2)
            total *= entero;

        System.out.printf("El producto es %d%n", total);
    }
}
