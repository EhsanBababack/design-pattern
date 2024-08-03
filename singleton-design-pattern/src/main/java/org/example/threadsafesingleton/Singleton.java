package org.example.threadsafesingleton;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        // Initialization code, if needed
    }

    // Static method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}