package com.echo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 计算策略的具体实现类：乘法
 */
public class Multiplication implements ICalculateStrategy {

  @Override
  public BigDecimal doCalculate(BigDecimal a, BigDecimal b) {
    return a.multiply(b);
  }
}
