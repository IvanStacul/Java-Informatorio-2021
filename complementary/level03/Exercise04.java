/** Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando 
 * la operación de factorial pero no se desean valores repetidos.
*/
package complementary.level03;

import java.util.List;
import java.util.stream.Collectors;

public class Exercise04 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 4, 4);
        List<Integer> outpuList = numbers.stream()
                .map(Exercise04::factorial)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(outpuList);
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
