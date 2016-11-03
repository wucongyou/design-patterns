package com.echo.designpattern.chainofresponsibility;

/**
 * 抽象请求
 */
public abstract class Request {

  protected String content;

  public Request(String content) {
    this.content = content;
  }

  /**
   * 获取请求等级
   */
  protected abstract int getRequestLevel();

  /**
   * 获取请求内容
   */
  public String getRequestContent() {
    return content;
  }

  @Override
  public String toString() {
    return "Request [content = " + content + "]";
  }

}
