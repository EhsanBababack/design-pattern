package org.example;

public class Roban extends TreeDecorator{
    public Roban(Tree tree) {
        super(tree);
    }

    @Override
    public String decorate() {
        return super.decorate() +" with blue roban" ;
    }
}
