package com.echo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * 计算策略的具体实现类：加法
 */
public class Addition implements ICalculateStrategy {

    @Override
    public BigDecimal doCalculate(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }

}
