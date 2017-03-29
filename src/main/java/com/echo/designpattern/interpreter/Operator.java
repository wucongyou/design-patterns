package com.echo.designpattern.interpreter;

/**
 * @author echo
 * @since 16-11-3
 */
public enum Operator {

    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/");

    private String value;

    Operator(String value) {
        this.value = value;
    }

    public static Operator of(String s) {
        for (Operator operator : Operator.values()) {
            if (operator.value.equals(s)) {
                return operator;
            }
        }
        return null;
    }

}
