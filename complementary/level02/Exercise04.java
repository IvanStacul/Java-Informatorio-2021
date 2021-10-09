/** Cargar un arrayList con 12 nombres de estudiantes (String), luego 
 * separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 */

package complementary.level02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise04 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.addAll(Arrays.asList("Ivan", "Angel", "Emilio", "Elias", "Lucas", "Matias", "Facundo", "Nicolas",
                "Jose", "Maximiliano", "Braian", "Santiago"));

        List<List<String>> courses = new ArrayList<List<String>>();

        for (int i = 0; i < 3; i++) {
            courses.add(students.subList(0 + 4 * i, 3 + 4 * i));
        }

        System.out.println(courses);

        int count = 1;
        for (List<String> course : courses) {
            System.out.println("course #" + (count++) + ": " + course);
        }
    }
}
