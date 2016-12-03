package com.echo.designpattern.builder;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Computer {

  private String mainBoard;
  private String cpu;
  private String gpu;
  private String memory;
  private String disk;
  private String power;

}
