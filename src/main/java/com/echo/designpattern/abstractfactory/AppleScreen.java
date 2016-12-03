package com.echo.designpattern.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppleScreen implements IScreen {

  private static final String COMPANY_NAME = "Apple";
  private static final String PRODUCT_CATEGORY = "Screen";
  private String name;

  @Override
  public void doDisplay() {
    System.out.println(String.format("%s:%s:%s",
        COMPANY_NAME, PRODUCT_CATEGORY, name));
  }

}
