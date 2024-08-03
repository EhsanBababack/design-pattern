package org.example;

public class JavaProgrammer implements Programmer {
    @Override
    public void program() {
        System.out.println("java programmer");
    }

    @Override
    public void test() {
        System.out.println("java test");
    }
}
