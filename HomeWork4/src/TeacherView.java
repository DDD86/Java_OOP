import java.util.List;

public class TeacherView {
    public void sendOnConsole(List<Teacher> teachers) {
        System.out.println("Список учителей:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getFullName() + " - " + teacher.getSubject());
        }
    }
}
