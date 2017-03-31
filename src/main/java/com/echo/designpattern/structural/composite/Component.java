package com.echo.designpattern.structural.composite;

public abstract class Component {

    protected String name;

    public Component(String name) {
        this.name = name;
    }

    protected abstract Component add(Component component);

    protected abstract Component remove(Component component);

    protected abstract void eachChild();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
