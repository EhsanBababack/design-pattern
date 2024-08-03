package org.example;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Context context =  new Context(OutPutFormat.XML);
        context.appendList(List.of("Coffee","Tee","Milk"));
        System.out.println(context.toString());
    }
}