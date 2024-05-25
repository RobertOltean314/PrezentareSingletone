package org.example;

public class Main {
    public static void main(String[] args) {
        ULBSTeachers csTeachers = ULBSTeachers.getInstance();
        ULBSTeachers mechatronicTeachers = ULBSTeachers.getInstance();
        ULBSTeachers lettersTeachers = ULBSTeachers.getInstance();

        DataBaseConnection conn1 = DataBaseConnection.getInstance();
        DataBaseConnection conn2 = DataBaseConnection.getInstance();
        DataBaseConnection conn3 = DataBaseConnection.getInstance();

        csTeachers.showMessage();
        mechatronicTeachers.showMessage();
        lettersTeachers.showMessage();

        conn1.showMessage();
        conn2.showMessage();
        conn3.showMessage();
    }
}
