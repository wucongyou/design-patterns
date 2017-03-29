package com.echo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 计算策略的具体实现类：减法
 */
public class Subtraction implements ICalculateStrategy {

    @Override
    public BigDecimal doCalculate(BigDecimal a, BigDecimal b) {
        return a.subtract(b);
    }

}
