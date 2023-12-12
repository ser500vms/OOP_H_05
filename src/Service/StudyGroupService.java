package Service;

import Data.*;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

  private DataService service;
    public StudyGroupService() {

    }
    public void create(Teacher teacher, List<Student> studentList) {
        StudyGroup studyGroup = new StudyGroup(teacher, studentList);
        System.out.println(studyGroup);
    }

}
