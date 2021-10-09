/** Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir 
 * el resultado de la suma, resta, multiplicación, división y módulo (resto de la 
 * división) de ambos números.
 */

package complementary.level01;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter number one: ");
        number1 = scanner.nextInt();
        System.out.print("Enter number two: ");
        number2 = scanner.nextInt();

        scanner.close();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
    }
}
