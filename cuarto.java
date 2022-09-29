/*2.33 Cree una calculadora del BMI que lea el peso del usuario en libras y la altura en pulgadas (o, si lo prefiere, el peso del 
usuario en kilogramos y la altura en metros), para que luego calcule y muestre el índice de masa corporal del usuario. 
Muestre además la siguiente información del Departamento de Salud y Servicios Humanos/Instituto Nacional de 
Salud para que el usuario pueda evaluar su BMI*/

import java.util.Scanner;

public class cuarto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float pk, ap, bmi;

        System.out.print("Ingrese su peso en libras \n ");
        pk = entrada.nextFloat();

        System.out.print("Ingrese ingrese su altura en pulgada:\n ");
        System.out.print("1 cm = 0,39370079 pulg \n");
        ap = entrada.nextFloat();

        bmi = ((pk) * (703) / (ap * ap));

        System.out.print("Tu Indice de Masa Corporal es: " + bmi);
        System.out.print("\n");

        if (bmi < 30) {
            System.out.print("estas dentro de sobrepeso :/");
            System.out.print("\n");

        }
        if (bmi < 25) {
            System.out.print("estas dentro del peso normal <3");
            System.out.print("\n");

        }
        if (bmi < 18) {
            System.out.print("estas bajo de peso, Alimentate :)");
            System.out.print("\n");

        }
        if (bmi > 30) {
            System.out.print("estas dentro de obesidad :(");
            System.out.print("\n");
        }

    }
}
