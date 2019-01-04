package com.dekiemtra;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Teacher teacher = new Teacher();
        Teacher teacher1 = new Teacher();
        teacher.inputTeacher();
        teacher1.inputTeacher();
        manager.addTeacher(teacher);
        manager.outputListTeacher();
    }
}
