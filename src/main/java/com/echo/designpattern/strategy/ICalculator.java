package com.echo.designpattern.strategy;

import java.math.BigDecimal;

/**
 * @author echo
 * @since 16-11-3
 */
public interface ICalculator {

  void setCalculateStrategy(ICalculateStrategy calculateStrategy);

  String getPrettyOutput();

  void doInput(String ope1, String ope2);

}
