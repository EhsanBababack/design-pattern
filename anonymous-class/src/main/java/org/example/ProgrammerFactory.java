package org.example;


public class ProgrammerFactory {
    public static Programmer getProgrammer(String type) {
        Programmer programmer;
        switch (type) {
            case "java" -> programmer = new Programmer() {
                @Override
                public void program() {
                    System.out.println("java program");
                }

                @Override
                public void test() {
                    System.out.println("java test");
                }
            };
            case "php" -> programmer = new Programmer() {
                @Override
                public void program() {
                    System.out.println("php program");
                }

                @Override
                public void test() {
                    System.out.println("php test");
                }
            };
            default -> programmer = new Programmer() {
                @Override
                public void program() {
                    System.out.println("php program");
                }

                @Override
                public void test() {
                    System.out.println("php default test");
                }
            };
        }
        return programmer;
    }
}