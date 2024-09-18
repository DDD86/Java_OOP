import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students and a teacher
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ivan"));
        students.add(new Student(2, "Anna"));
        students.add(new Student(3, "Petr"));

        Teacher teacher = new Teacher(1, "Sergey");

        // Create service and controller
        StudyGroupService service = new StudyGroupService();
        Controller controller = new Controller(service);

        // Display information about the study group
        controller.displayGroupInfo(teacher, students);
    }
}
