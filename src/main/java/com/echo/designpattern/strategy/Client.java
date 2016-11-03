package com.echo.designpattern.strategy;

public class Client {

  public static void main(String[] args) {
    ICalculateStrategy[] calculateStrategies = {new Addition(),
        new Substraction(),
        new Multiplication(),
        new Division()};
    ICalculator calculator = new Calculator();
    for (ICalculateStrategy calculateStrategy : calculateStrategies) {
      calculator.setCalculateStrategy(calculateStrategy);
      calculator.doInput("3", "5");
      System.out.println(calculator.getPrettyOutput());
    }
  }

}
