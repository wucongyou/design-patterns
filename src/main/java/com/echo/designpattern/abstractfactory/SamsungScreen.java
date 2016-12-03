package com.echo.designpattern.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SamsungScreen implements IScreen {

  private static final String COMPANY_NAME = "Samsung";
  private static final String PRODUCT_CATEGORY = "Screen";
  private String name;

  @Override
  public void doDisplay() {
    System.out.println(String.format("%s:%s:%s",
        COMPANY_NAME, PRODUCT_CATEGORY, name));
  }

}
