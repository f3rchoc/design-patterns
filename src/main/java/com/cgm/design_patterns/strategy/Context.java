package com.cgm.design_patterns.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Context {

    private Operation operation;

    public Long executeOperation(Long numOne, Long numTwo) {
        return operation.doOperation(numOne, numTwo);
    }

}
