import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Добавлен учитель: " + teacher.getFullName() + " (ID: " + teacher.getId() + ")");
    }

    public void updateTeacherById(int id, String fullName, String subject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setFullName(fullName);
                teacher.setSubject(subject);
                System.out.println("Учитель с ID " + id + " обновлен: " + fullName);
                return;
            }
        }
        System.out.println("Учитель с ID " + id + " не найден.");
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
