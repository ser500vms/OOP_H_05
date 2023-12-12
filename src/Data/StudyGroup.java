package Data;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> studentList;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup:" + '\n' +
                teacher + '\n' +
                "Student List = " + studentList;
    }
}
