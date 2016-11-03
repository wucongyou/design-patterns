package com.echo.designpattern.chainofresponsibility;

public class Client {

  public static void main(String[] args) {
    Handler h1 = new ConcreteHandler1("Level-1 handler");
    Handler h2 = new ConcreteHandler2("Level-2 handler");
    Handler h3 = new ConcreteHandler3("Level-3 handler");
    // 成链
    h1.setSuccessor(h2);
    h2.setSuccessor(h3);

    Request req = new ConcreteRequest2("Request to level 2 handler");
    boolean result = h1.handleRequest(req);
    System.out.println("处理结果：" + result);
    System.out.println();
    h1 = new ConcreteHandler1("Level-1 handler");
    h2 = new ConcreteHandler1("Another level-1 handler");
    h3 = new ConcreteHandler3("Level-3 handler");
    // 成链
    h1.setSuccessor(h2);
    h2.setSuccessor(h3);

    req = new ConcreteRequest2("Request to level 2 handler");
    result = h1.handleRequest(req);
    System.out.println("处理结果：" + result);
  }

}
