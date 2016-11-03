package com.echo.designpattern.visitor;

/**
 * Concrete visitor
 */
public class VisitorA implements IVisitor {

  private String name = "A";

  @Override
  public void visit(NodeA concreteNodeA) {
    System.out.println("Visitor " + name + " visits nodeA");
  }

  @Override
  public void visit(NodeB concreteNodeB) {
    System.out.println("Visitor " + name + " visits nodeB");
  }

}
