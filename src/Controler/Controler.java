package Controler;

import Data.*;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;
import View.TeacherView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB){
        service.create(firstName,secondName,lastName,dateB, Type.TEACHER);
    }

    public void getAllStudent(){
        List<Student> userList = service.getAllStudent();
        for (Student student: userList){
            studentView.printOnConsole(student);
        }
    }

    public void getStudentById(int studentId){
        User user = service.getUserById(Type.STUDENT, studentId);
        studentView.printOnConsole((Student) user);

    }

    public void getTeacherById(int teacherId){
        User user = service.getUserById(Type.TEACHER, teacherId);
        teacherView.printOnConsole((Teacher) user);

    }

    public void createStudyGroup(int teacherId){
        studyGroupService.create((Teacher) service.getUserById(Type.TEACHER, teacherId),
                service.getAllStudent());
    }

}
