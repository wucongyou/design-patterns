package com.echo.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Object structure
 */
public class ObjectStructure {
	public List<Node> nodes;

	public ObjectStructure(Node... nodes) {
		this.nodes = new ArrayList<Node>();
		for (Node node : nodes) {
			this.nodes.add(node);
		}
	}

	public void accept(Visitor visitor) {
		for (Node node : nodes) {
			node.accept(visitor);
		}
	}

	public void add(Node node) {
		nodes.add(node);
	}

	public void remove(Node node) {
		nodes.remove(node);
	}

}
