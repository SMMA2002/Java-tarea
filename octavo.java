/*2.28 (Diámetro, circunferencia y área de un círculo) He aquí un adelanto. En este capítulo aprendió sobre los 
enteros y el tipo int. Java también puede representar números de punto flotante que contienen puntos decimales, 
como 3.14159. Escriba una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro, la circunferencia y el área del círculo mediante el uso del valor de punto flotante 3.14159 para π. Use las 
técnicas que se muestran en la figura 2.7 [nota: también puede utilizar la constante predefinida Math.PI para el valor 
de π. Esta constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las clases en 
este paquete se importan de manera automática, por lo que no necesita importar la clase Math mediante la instrucción 
import para usarla]. Use las siguientes fórmulas (r es el radio):*/

import java.util.Scanner;

public class octavo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int r;
        double d, c, a;

        System.out.printf("escriba el radio%n");
        r = entrada.nextInt();

        d = (2 * r);
        System.out.printf("El diametro es: " + d);
        System.out.printf("%n");

        c = (6.2832 * r);
        System.out.printf("La circuferencia es: " + c);
        System.out.printf("%n");

        a = 3.1416 * Math.pow(r, 2);
        System.out.printf("El area es: " + a);
        System.out.printf("%n");

    }
}
