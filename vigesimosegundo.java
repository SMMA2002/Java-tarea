public class vigesimosegundo {
    public static void main(String[] args) {

        int t = 10;

        System.out.println("\n");

        for (int c = 1; c <= t; c++) {
            for (int j = 1; j <= c; j++)
                System.out.print("*");

            for (int k = c + 1; k <= t; k++)
                System.out.print(" ");

            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            for (int l = 1; l <= t + 1 - c; l++)
                System.out.print("*");

            for (int m = t - 1 - c; m <= t; m++)
                System.out.print(" ");

            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            for (int n = 1; n < c; n++)
                System.out.print(" ");

            for (int p = c; p <= t; p++)
                System.out.print("*");

            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            for (int q = 1; q <= t - c; q++)
                System.out.print(" ");

            for (int r = t - c; r < t; r++)
                System.out.print("*");

            System.out.println();
        }

        System.out.println("\n");
    }

}
