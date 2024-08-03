package org.example.threadsafesingleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        String string = singleton.toString();
        System.out.println(string);

//      same address because This is exactly the same thing
        Singleton singleton2 = Singleton.getInstance();
        String string2 = singleton2.toString();
        System.out.println(string2);
    }
}