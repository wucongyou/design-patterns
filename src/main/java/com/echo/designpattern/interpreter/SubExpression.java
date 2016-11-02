package com.echo.designpattern.interpreter;

/**
 * Created by echo on 16-9-20.
 */
public class SubExpression implements Expression {

  @Override
  public int interprete(Context context) {
    return context.getOpe1() - context.getOpe2();
  }
}
