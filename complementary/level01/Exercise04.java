/** Realizar un programa que calcule el factorial de un número:
 * n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
 * Sin hacer uso de librerías.
 */

package complementary.level01;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();

        System.out.println("factorial of " + number + " is: " + factorial(number));
    }

    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        } else if (number == 0) {
            return 1;
        } else {
            return number *= factorial(number - 1);
        }
    }
}
