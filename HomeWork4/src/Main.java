public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();

        // Создание учителей
        teacherController.createTeacher("Анна Смирнова", "Математика");
        teacherController.createTeacher("Игорь Кузнецов", "Физика");

        // Отображение списка учителей
        teacherController.displayTeachers();

        // Обновление учителя по ID
        teacherController.updateTeacherById(1, "Анна Смирнова", "Алгебра");

        // Отображение списка учителей после обновления
        teacherController.displayTeachers();
    }
}