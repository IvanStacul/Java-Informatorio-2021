/** Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
 * valores que NO sean null o vacío ("").
*/
package complementary.level03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise01 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hola");
        words.add(null);
        words.add("Informatorio");
        words.add("");
        List<String> filtredList = words.stream()
                .filter(Objects::nonNull)
                .filter(p -> !p.equals(""))
                .collect(Collectors.toList());
        System.out.println(filtredList);
    }
}
