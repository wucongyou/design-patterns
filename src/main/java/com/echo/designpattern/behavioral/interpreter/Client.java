package com.echo.designpattern.behavioral.interpreter;

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
            String currentToken = exp[count];
            if (isOperator(currentToken)) {
                System.out.println("operator: " + currentToken);
                String ope2Str = stack.pop();
                System.out.println("popped token as ope2: " + ope2Str);
                String ope1Str = stack.pop();
                System.out.println("popped token as ope1: " + ope1Str);
                int ope2 = Integer.parseInt(ope2Str);
                int ope1 = Integer.parseInt(ope1Str);
                Context context = new Context(ope1, ope2);
                // Storage complete expression
                String expcontent2 = expContentStack.pop();
                String expcontent1 = expContentStack.pop();
                expContentStack.push(expcontent1 + currentToken + expcontent2);

                IExpression expression = simpleExpressionFactory(currentToken);
                int tmpResult = expression.interpret(context);
                System.out.println("push result: " + tmpResult);
                stack.push(tmpResult + "");
            } else {
                System.out.println("push token: " + currentToken);
                stack.push(currentToken);
                // Storage complete expresion
                expContentStack.push(currentToken);
            }
            ++count;
        }

        System.out.print(expContentStack.pop() + " = ");
        System.out.println(Integer.parseInt(stack.pop()));

    }

    public static boolean isOperator(String s) {
        return null != Operator.of(s);
    }


    public static IExpression simpleExpressionFactory(String s) {
        Operator operator = Operator.of(s);
        if (null == operator) {
            throw new IllegalArgumentException("failed to parse operator");
        }
        switch (operator) {
            case ADDITION:
                return new Addition();
            case SUBTRACTION:
                return new Subtraction();
            case MULTIPLICATION:
                return new Multiplication();
            default:
                throw new IllegalArgumentException("unsupported operator");
        }
    }

}
