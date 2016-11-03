package com.echo.designpattern.strategy;

import java.math.BigDecimal;

public interface ICalculateStrategy {

  BigDecimal doCalculate(BigDecimal a, BigDecimal b);

}
