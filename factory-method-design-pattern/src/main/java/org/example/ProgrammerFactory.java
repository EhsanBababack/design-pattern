package org.example;

public class ProgrammerFactory {
    public static Programmer getProgrammer(String type) {
        Programmer programmer;
        switch (type) {
            case "java" -> programmer = new JavaProgrammer();
            case "php" -> programmer = new PhpProgrammer();
            default -> programmer = new JavaProgrammer();
        }
        return programmer;
    }
}
