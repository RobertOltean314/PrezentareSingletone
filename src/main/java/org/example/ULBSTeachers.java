package org.example;

public class ULBSTeachers {
    private static ULBSTeachers instance;

    private ULBSTeachers() {
    }

    public static ULBSTeachers getInstance() {
        if (instance == null) {
            instance = new ULBSTeachers();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Noi suntem profesorii ULBS!");
    }
}

