package org.example;

public class DataBaseConnection {
    private static DataBaseConnection instance;

    private DataBaseConnection() {
    }

    public static DataBaseConnection getInstance() {
        if (instance == null) {
            instance = new DataBaseConnection();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Conexiunea la baza de date a fost realizata cu succes!");
    }
}
