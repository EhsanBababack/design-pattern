package org.example;

public class Lamp extends TreeDecorator{
    public Lamp(Tree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " with red lamp";
    }
}
