package com.cgm.design_patterns.strategy;

/**
 * Example from: <a href="https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm">Strategy Pattern</a>
 */
public interface Operation {

    Long doOperation(final Long numOne, final Long numTwo);

}
