import java.util.List;

public class Controller {
    private StudyGroupService service;

    public Controller(StudyGroupService service) {
        this.service = service;
    }

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return service.createStudyGroup(teacher, students);
    }

    public void displayGroupInfo(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = createStudyGroup(teacher, students);
        System.out.println(studyGroup);
    }
}
