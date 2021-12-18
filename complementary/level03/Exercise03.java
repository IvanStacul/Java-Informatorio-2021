/** Se dispone de una lista de Strings, de la cual saber la cantidad de valores que
 * comiencen con la letra B (tanto mayúscula como minúscula, en ese caso decimos que 
 * será ignoreCase).
*/

package complementary.level03;

import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        List<String> wordsList = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long count = wordsList.stream()
                .filter(word -> word.startsWith("B") || word.startsWith("b"))
                .count();
        System.out.println(count);
    }
}
