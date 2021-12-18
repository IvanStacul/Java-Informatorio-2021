/** Dada una lista que contiene números enteros, se deberá generar otra lista que
 * contendrá el resultado de aplicar la operación de potencia a 2.
*/

package complementary.level03;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise02 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Integer exponent = 2;
        List<Integer> numbers = integers.stream()
                .map(number -> pow(number, exponent))
                .collect(Collectors.toList());
        System.out.println(numbers);
    }

    public static Integer pow(int base, int exp) {
        if (exp == 0)
            return 1;
        else
            return base * pow(base, exp - 1);
    }
}