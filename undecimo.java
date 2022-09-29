
/*(Calculadora del salario) Desarrolle una aplicación en Java que determine el sueldo bruto para cada uno de 
tres empleados. La empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y 
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de la empresa,
 el número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada empleado. Su programa debe recibir 
como entrada esta información para cada empleado, para luego determinar y mostrar el sueldo bruto de cada trabajador.
 Utilice la clase Scanner para introducir los dato */
import java.util.Scanner;

public class undecimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ne = 1;
        int h = 0;
        double s = 0;
        double t = 0;

        while (10 >= ne) {
            System.out.printf("\nIngrese el numero de horas que trabajo el empleado %d: ", ne);
            h = entrada.nextInt();

            System.out.printf("\nIngrese el salario por hora del empleado %d: ", ne);
            s = entrada.nextDouble();

            if (40 >= h)
                t = h * s;
            else
                t = 40 * s + (h - 40) * (s + s / 2);

            System.out.printf("\nEl salario del empleado numero %d es %.2f\n", ne++, t);
        }

    }
}
