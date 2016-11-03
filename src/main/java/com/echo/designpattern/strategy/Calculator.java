package com.echo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 计算策略的应用类：简易计算器
 */
public class Calculator implements ICalculator {

  private BigDecimal ope1;
  private BigDecimal ope2;
  private ICalculateStrategy calculateStrategy;

  public Calculator() {
  }

  public Calculator(ICalculateStrategy calculateStrategy) {
    this.calculateStrategy = calculateStrategy;
  }

  @Override
  public void setCalculateStrategy(ICalculateStrategy calculateStrategy) {
    this.calculateStrategy = calculateStrategy;
  }

  @Override
  public String getPrettyOutput() {
    return calculateStrategy.doCalculate(ope1, ope2).toString();
  }

  @Override
  public void doInput(String ope1, String ope2) {
    this.ope1 = new BigDecimal(ope1);
    this.ope2 = new BigDecimal(ope2);
  }

}
