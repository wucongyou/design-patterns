package com.echo.designpattern.strategy;
/**
 * 计算策略的具体实现类：整数除法
 */
public class DivideCalculate implements CalculateStrategy {

	@Override
	public double calculate(int a, int b) {
		if (b == 0)
			throw new RuntimeException("除数不能为0");
		return (double)a / b;
	}
}
