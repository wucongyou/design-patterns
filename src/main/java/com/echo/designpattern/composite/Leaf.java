package com.echo.designpattern.composite;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public Component add(Component component) {
        throw new IllegalArgumentException("unsupported operation");
    }

    @Override
    public Component remove(Component component) {
        throw new IllegalArgumentException("unsupported operation");
    }

    @Override
    public void eachChild() {
        System.out.println(name);
    }
}
