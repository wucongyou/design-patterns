package com.echo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 计算策略的具体实现类：整数减法
 */
public class Substraction implements ICalculateStrategy {

  @Override
  public BigDecimal doCalculate(BigDecimal a, BigDecimal b) {
    return a.subtract(b);
  }

}
