package com.echo.designpattern.visitor;

/**
 * Concrete node
 */
public class NodeB implements INode {

  @Override
  public void doAccept(IVisitor visitor) {
    visitor.visit(this);
  }

}
