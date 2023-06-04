public class StudentRepository {

    private final StudentGroup studentGroup;

    public StudentRepository(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.addStudent(student);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void sortName() {
        studentGroup.sortName();
    }

    public void sortSurname() {
        studentGroup.sortSurname();
    }

}

