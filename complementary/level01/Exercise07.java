/** Realizar un programa que dado un String de entrada en minúsculas lo 
 * convierta por completo a mayúsculas. Sin uso de métodos o librerías 
 * que realicen toUppercase(). 
 */

package complementary.level01;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.print("Enter a lowercase string: ");
        string = scanner.nextLine();
        scanner.close();
        String output = "";

        for (char c : string.toCharArray()) {
            output += (char) (((int) c) - 32);
        }

        System.out.println(output);
    }
}
