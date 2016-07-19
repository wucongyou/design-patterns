package com.echo.designpattern.interpreter;

import java.util.Arrays;
import java.util.Stack;

public class Client {

	public static void main(String[] args) {

		// 2+5*8-6
		String expStr = "2 5 8 * + 6 -";
		String[] exp = expStr.split(" ");
		System.out.println(Arrays.toString(exp));
		Stack<String> stack = new Stack<String>();
		Stack<String> expContentStack = new Stack<String>();
		int count = 0;

		while (count < exp.length) {
			String currenttoken = exp[count];
			if (isOperator(currenttoken)) {
				System.out.println("operator: " + currenttoken);
				String ope2Str = stack.pop();
				System.out.println("poped token as ope2: " + ope2Str);
				String ope1Str = stack.pop();
				System.out.println("poped token as ope1: " + ope1Str);
				int ope2 = Integer.parseInt(ope2Str);
				int ope1 = Integer.parseInt(ope1Str);
				Context context = new Context(ope1, ope2);
				// Storage complete expression
				String expcontent2 = expContentStack.pop();
				String expcontent1 = expContentStack.pop();
				expContentStack.push(expcontent1 + currenttoken + expcontent2);

				Expression expression = simpleExpressionFactory(currenttoken);
				int tmpResult = expression.interprete(context);
				System.out.println("push result: " + tmpResult);
				stack.push(tmpResult + "");
			} else {
				System.out.println("push token: " + currenttoken);
				stack.push(currenttoken);
				// Storage complete expresion
				expContentStack.push(currenttoken);
			}
			++count;
		}

		System.out.print(expContentStack.pop() + " = ");
		System.out.println(Integer.parseInt(stack.pop()));

	}

	public static boolean isOperator(String s) {
		if ("+".equals(s) || "-".equals(s) || "*".equals(s))
			return true;
		return false;
	}

	public static Expression simpleExpressionFactory(String s) {
		if ("+".equals(s)) {
			return new PlusExpression();
		} else if ("-".equals(s)) {
			return new MinusExpression();
		} else if ("*".equals(s)) {
			return new MultiplyExpression();
		} else
			throw new RuntimeException("运算符解析错误");
	}

}
