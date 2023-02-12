package mockito;

import java.util.List;

public class ClientBusinessObjectImpl {

    private StudentDataObject studentDataObject;
    public List<Student> getAllStudentsBySubject(String subject){
        List<Student> allStudents = studentDataObject.getAllStudents();
        List<Student> filteredStudents = null;
        for(int i = 0; i < allStudents.size(); i++){
            if(allStudents.get(i) != null && allStudents.get(i).getClassName().equals(subject)){
                assert filteredStudents != null;
                filteredStudents.add(allStudents.get(i));
            }
        }
        return filteredStudents;
    }
}
