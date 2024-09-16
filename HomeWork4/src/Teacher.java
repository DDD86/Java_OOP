public class Teacher extends User {
    private static int idCounter = 0; // Статический счётчик для уникальных ID
    private final int id; // Уникальный идентификатор учителя
    private String subject;

    public Teacher(String fullName, String subject) {
        super(fullName);
        this.id = ++idCounter; // Присваивание уникального ID каждому новому учителю
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
