/** Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre 
 * y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea generar un 
 * Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre 
 * (con separador de espacio en blanco) y el value la edad del alumno. 
 * ● La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el 
 * ejemplo y demostrar su funcionamiento.
 * ● En ejemplo se muestra solo con 1 Alumno a modo de abreviar 
 * ● En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar 
 * se deberá usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver 
 * métodos .parse(), etc)
 * */
package complementary.level03;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.time.Period;

public class Exercise05 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Homero", "Simpson", LocalDate.parse("1982-10-29")),
                new Student("Lisa", "Simpson", LocalDate.of(1986, 5, 12)),
                new Student("Bart", "Simpson", LocalDate.of(1998, 2, 10)),
                new Student("Maggie", "Simpson", LocalDate.of(2005, 3, 30)),
                new Student("Abbe", "Simpson", LocalDate.of(1931, 11, 11)));
        Map<String, Integer> outputMap = students.stream()
                .collect(Collectors
                        .toMap(p -> (p.getName() + " " + p.getLastName()),
                                p -> Exercise05.getEdad(p.getBirthDate())));
        System.out.println(outputMap);
    }

    public static Integer getEdad(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
