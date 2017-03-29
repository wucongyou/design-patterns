package com.echo.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> list = new ArrayList<Component>();

    @Override
    protected void add(Component component) {
        list.add(component);
    }

    @Override
    protected void remove(Component component) {
        list.remove(component);
    }

    @Override
    protected void eachChild() {
        eachChild(0);
    }

    protected void eachChild(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component c : list) {
            c.eachChild(n + 4);
        }
    }

}
