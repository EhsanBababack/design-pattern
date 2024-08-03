package org.example;

public class PhpProgrammer implements Programmer{
    @Override
    public void program() {
        System.out.println("php programmer");
    }

    @Override
    public void test() {
        System.out.println("php test");
    }
}
