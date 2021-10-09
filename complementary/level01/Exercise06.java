/** Se desea una aplicación que solicite 2 números enteros y realice la 
 * operación de potencia (sin uso de librerías).
 */
package complementary.level01;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        System.out.print("Enter number one: ");
        number1 = scanner.nextInt();
        System.out.print("Enter number two: ");
        number2 = scanner.nextInt();

        scanner.close();

        System.out.println(number1 + " ^ " + number2 + " = " + pow(number1, number2));
    }

    public static float pow(int base, int exp) {
        if (exp == 0)
            return 1;
        else if (exp < 0)
            return 1 / pow(base, Math.abs(exp));
        else
            return base * pow(base, exp - 1);
    }
}
