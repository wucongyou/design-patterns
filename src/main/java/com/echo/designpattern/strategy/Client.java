package com.echo.designpattern.strategy;

public class Client {
	public static void main(String[] args) {

		Calculator calculator = new Calculator(new AddCalculate());
		calculator.setOpe1(3);
		calculator.setOpe2(5);
		System.out.println(calculator.getResult());

		calculator = new Calculator(new SubCalculate());
		calculator.setOpe1(3);
		calculator.setOpe2(5);
		System.out.println(calculator.getResult());

		calculator = new Calculator(new MultiplyCalculate());
		calculator.setOpe1(3);
		calculator.setOpe2(5);
		System.out.println(calculator.getResult());

		calculator = new Calculator(new DivideCalculate());
		calculator.setOpe1(5);
		calculator.setOpe2(3);
		System.out.println(calculator.getResult());
	}
}
