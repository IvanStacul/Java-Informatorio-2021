/** Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente 
 * mensaje “HOLA {USUARIO}!!!”
 */

package complementary.level01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, what is your name?: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hi, " + name);
    }
}
