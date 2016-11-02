package com.echo.designpattern.interpreter;

public class Context {
  private int ope1;
  private int ope2;


  public Context(int ope1, int ope2) {
    this.ope1 = ope1;
    this.ope2 = ope2;
  }

  public int getOpe1() {
    return ope1;
  }

  public void setOpe1(int ope1) {
    this.ope1 = ope1;
  }

  public int getOpe2() {
    return ope2;
  }

  public void setOpe2(int ope2) {
    this.ope2 = ope2;
  }

}
