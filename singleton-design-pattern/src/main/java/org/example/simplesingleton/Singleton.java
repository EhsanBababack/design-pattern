package org.example.simplesingleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Initialization code, if needed
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}