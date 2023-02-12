package mockito;

import java.util.List;

public class StudentDataObject {
    private List<Student> studentList;
    public List<Student> getAllStudents(){
        return studentList;
    }

    public StudentDataObject(List<Student> studentList) {
        this.studentList = studentList;
    }
}
