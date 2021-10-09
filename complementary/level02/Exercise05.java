/** Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
 * valor-por-hora(array2) del resumen de carga de horas semanal 
 * de un empleado. Se debe generar otra lista que contenga los 
 * totales y luego imprimir el total final a cobrar. 
 */

package complementary.level02;

import java.util.ArrayList;
import java.util.List;

public class Exercise05 {
    public static void main(String[] args) {
        List<Integer> workedHours = new ArrayList<>();
        List<Float> valueHours = new ArrayList<>();
        int min = 0;
        int max = 20;
        for (int i = 0; i < 5; i++) {
            workedHours.add((int) (Math.random() * (max - min + 1) + min));
            valueHours.add((float)(Math.random() * (max - min + 1) + min));
        }

        List<Float> subtotals = new ArrayList<>();
        if (workedHours.size() == valueHours.size()) {
            for (int i = 0; i < workedHours.size(); i++) {
                subtotals.add((workedHours.get(i) * valueHours.get(i)));
            }
        }

        Float total = 0f;
        for (Float subtotal : subtotals) total += subtotal;

        System.out.println(total);
    }
}
