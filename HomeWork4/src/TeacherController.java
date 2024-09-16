public class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController() {
        this.teacherService = new TeacherService();
        this.teacherView = new TeacherView();
    }

    public void createTeacher(String fullName, String subject) {
        Teacher teacher = new Teacher(fullName, subject);
        teacherService.addTeacher(teacher);
        teacherView.sendOnConsole(teacherService.getTeachers());
    }

    public void updateTeacherById(int id, String fullName, String subject) {
        teacherService.updateTeacherById(id, fullName, subject);
        teacherView.sendOnConsole(teacherService.getTeachers());
    }

    public void displayTeachers() {
        teacherView.sendOnConsole(teacherService.getTeachers());
    }
}

