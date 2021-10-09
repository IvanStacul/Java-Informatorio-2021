/** Dado un String de entrada (frase, texto, etc) calcular la cantidad de 
 * veces que aparece una letra dada.
 */
package complementary.level01;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        char character;
        System.out.print("Enter a word or phrase: ");
        string = scanner.nextLine();
        System.out.print("Enter a character: ");
        character = scanner.next().charAt(0);
        scanner.close();
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == character)
                count++;
        }
        System.out.println(count);
    }
}
