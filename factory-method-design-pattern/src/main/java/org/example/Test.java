package org.example;

public class Test {
    public static void main(String[] args) {
        Programmer php = ProgrammerFactory.getProgrammer("php");
        php.program();
    }
}
