package com.echo.designpattern.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

/**
 * @author echo
 * @since 16-11-3
 */
public class NodeCollection implements INode {

    private List<INode> nodes;

    public NodeCollection() {
        nodes = Arrays.asList(new NodeA(), new NodeB());
    }

    @Override
    public void doAccept(IVisitor visitor) {
        for (INode node : nodes) {
            node.doAccept(visitor);
        }
    }

}
