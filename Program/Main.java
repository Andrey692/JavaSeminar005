package Program;

import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("1", "1", "1");
        controller.createStudent("2", "2", "2");
        controller.createStudent("11", "11", "11");
        controller.createStudent("22", "22", "22");
        controller.createStudent("111", "111", "111");
        controller.createStudent("222", "222", "222");
        controller.createStudent("3", "3", "3");
        controller.createStudent("4", "4", "4");
        controller.createStudent("33", "33", "33");
        controller.createStudent("44", "44", "44");

        controller.createTeacher("W", "W", "W");
        controller.createTeacher("Y", "Y", "Y");

        // controller.getAllStudent();
        System.out.println();
        controller.createStudyGroup();

    }
}
