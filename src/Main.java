import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    static Set<Student> students = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws NotEnoughDataException {
        while (true) {
            System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\":");
            String studentString = scanner.nextLine();
            if (studentString.equals("end")) {
                break;
            }
            Student student = new Student(studentString);
            if (students.contains(student)) {
                System.out.println(String.format("Студент с номером студенческого билета %s уже существует!", student.getStudentId()));
            } else {
                students.add(student);
            }
        }
        System.out.println("Список студентов: ");
        for (Student student : students) {
            System.out.println("\t - " + student.toString());
        }
    }
}
