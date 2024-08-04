package org.example;

public class Test {
    public static void main(String[] args) {
//        Tree tree = new TreeImpl();
//        String decorate = tree.decorate();
//        Lamp lamp = new Lamp(tree);
//        System.out.println(lamp.decorate());
        Tree tree = new TreeImpl();
        TreeDecorator treeDecorator = new Lamp(new Lamp(new Lamp(tree)));
        System.out.println(treeDecorator.decorate());

    }
}
