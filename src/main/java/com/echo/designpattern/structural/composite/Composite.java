package com.echo.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    protected Component add(Component component) {
        children.add(component);
        return this;
    }

    @Override
    protected Component remove(Component component) {
        children.remove(component);
        return this;
    }

    @Override
    protected void eachChild() {
        eachChild(this, 0);
    }

    private void eachChild(Component component, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println(component.getName());
        if (component instanceof Leaf) {
            return;
        }
        for (Component child : ((Composite) component).children) {
            eachChild(child, n + 4);
        }
    }
}
