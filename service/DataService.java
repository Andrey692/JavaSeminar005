// Создать package – service. Работу продолжаем в нем
//  Создать класс DataService с методами в по управлению сущностями User
// (create, read) и агрегирующий всех пользователей заведенных в системе
//  StudentId должны быть созданы по алгоритму – максимальный id в
// коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
// элементов и instanceOf

package service;

import java.util.ArrayList;
import java.util.List;

import model.User;
import model.Student;
import model.Teacher;
import model.Type;

public class DataService {
    private List<User> userList = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getFreeId(type);
        if (type == model.Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == model.Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }
    }

    private int getFreeId(Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int LastId = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent)
                LastId = ((Teacher) user).getTeacherId() + 1;
            if (user instanceof Student && itsStudent)
                LastId = ((Student) user).getStudentId() + 1;
        }
        return LastId;
    }

    public List<Student> getAllStudent() {
        List<Student> result = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student)
                result.add((Student) user);

        }
        return result;
    }

    public List<Teacher> getAllTeacher() {
        List<Teacher> result = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher) {
                result.add((Teacher) user);
            }
        }
        return result;
    }

    public Teacher getTeacher() {
        List<Teacher> result = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Teacher) {
                result.add((Teacher) user);
            }
        }
        return result.getFirst();
    }
}
