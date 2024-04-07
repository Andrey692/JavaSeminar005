
package controller;

import java.util.ArrayList;
import java.util.List;
import model.User;
import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.Type;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;

public class Controller {
    List<Student> students = new ArrayList<>();
    private final DataService dataService = new DataService();
    private final StudyGroupService dataStudyGroupService = new StudyGroupService();
    private final StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public List<Student> getAllStudent() {
        List<Student> userList = dataService.getAllStudent();
        for (User user : userList) {
            studentView.printOmConsole(user);
        }
        return userList;
    }

    public Teacher getTeacher() {
        List<Teacher> userList = dataService.getAllTeacher();
        for (User user : userList) {
            studentView.printOmConsole(user);
            break;
        }
        return dataService.getTeacher();
    }

    public StudyGroup createStudyGroup() {
        return dataStudyGroupService.createStudyGroup(getTeacher(), getAllStudent());
    }
}
