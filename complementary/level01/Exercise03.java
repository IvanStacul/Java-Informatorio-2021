/** Confeccionar un programa que dado un número entero como dato de entrada 
 * imprima la secuencia de números (incrementos de 1) de la siguiente forma:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

package complementary.level01;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String output = "";

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= number; i++) {
            output += String.valueOf(i) + " ";
            System.out.println(output);
        }
    }
}
