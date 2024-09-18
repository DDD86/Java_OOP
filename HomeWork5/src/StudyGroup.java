import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        StringBuilder studentNames = new StringBuilder();
        for (Student student : students) {
            studentNames.append(student.getName()).append(", ");
        }
        if (studentNames.length() > 0) {
            studentNames.setLength(studentNames.length() - 2);
        }
        return "Учебная группа: Преподаватель - " + teacher.getName() +
                ", Студенты - " + studentNames.toString();
    }
}
