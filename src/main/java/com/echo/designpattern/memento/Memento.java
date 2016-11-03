package com.echo.designpattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Memento in this pattern,keeps the attributes of Originator which need to be
 * kept.
 */
@Data
@AllArgsConstructor
public class Memento {

  private int value;

}
