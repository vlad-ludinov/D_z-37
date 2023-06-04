public class Main {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        StudentRepository repository = new StudentRepository(group);
        StudentService service = new StudentService(repository);
        StudentController controller = new StudentController(service);
//----------------------------------------------------------------------
        controller.addStudent(new Student(8L, "Acna Aorozova"));
        controller.addStudent(new Student(8L, "Anna Eobozova"));
        controller.addStudent(new Student(8L, "Abna Corozova"));
        controller.addStudent(new Student(8L, "Anba Borozova"));
        controller.addStudent(new Student(8L, "Atna dorozova"));
        controller.addStudent(new Student(8L, "Anaa Eoaozova"));
        controller.addStudent(new Student(8L, "Ann Morozov"));
        controller.addStudent(new Student(8L, "Anna Morozova"));
        controller.addStudent(new Student(8L, "Бнна Дорозова"));
        controller.addStudent(new Student(8L, "Снна Борозова"));
        controller.addStudent(new Student(8L, "Абна Аорозова"));
        controller.addStudent(new Student(8L, "Аана Мовозова"));
        controller.addStudent(new Student(8L, "Анн Моабзова"));
        controller.addStudent(new Student(8L, "Аннаа Моаазова"));
        controller.addStudent(new Student(8L, "Аёна Морожова"));
        controller.addStudent(new Student(8L, "Аена Мороеова"));
        controller.addStudent(new Student(8L, "Ажна МороЁова"));


        

        controller.printAll();
        System.out.println();
        controller.sortName();
        controller.printAll();
        System.out.println();
        controller.sortSurname();
        controller.printAll();

        


    }
}