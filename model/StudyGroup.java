package model;

import java.util.List;

public class StudyGroup {
    List<Student> studentList;
    Teacher teacher;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                ", teacher=" + teacher +
                ", students=" + studentList +
                '}';
    }
}
