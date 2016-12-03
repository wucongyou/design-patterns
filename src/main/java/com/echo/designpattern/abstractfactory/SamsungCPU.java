package com.echo.designpattern.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SamsungCPU implements ICPU {

  private static final String COMPANY_NAME = "Samsung";
  private static final String PRODUCT_CATEGORY = "CPU";
  private String name;

  @Override
  public void doCalculate() {
    System.out.println(String.format("%s:%s:%s",
        COMPANY_NAME, PRODUCT_CATEGORY, name));
  }

}
