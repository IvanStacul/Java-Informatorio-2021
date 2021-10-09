/** Crear una aplicación que solicite de entrada los datos de una persona 
 * en este orden:
 * - Nombre y Apellido
 * - Edad
 * - Dirección
 * - Ciudad
 * 
 * Luego imprimirá el siguiente mensaje:
 * {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

package complementary.level01;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, city, address;
        Integer age;
        System.out.print("Enter your name and surname: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = Integer.valueOf(scanner.nextLine());
        System.out.print("Enter your city: ");
        city = scanner.nextLine();
        System.out.print("Enter your address: ");
        address = scanner.nextLine();
        scanner.close();

        System.out.println(String.format("{%s} - {%s} - {%d} - {%s}", city, address, age, name));
    }
}
