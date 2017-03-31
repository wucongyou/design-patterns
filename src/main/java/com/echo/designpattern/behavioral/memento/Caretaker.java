package com.echo.designpattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Caretaker in this pattern,holds a memento created by a originator.
 */
@Data
@AllArgsConstructor
public class Caretaker {

    private Memento memento;

}
