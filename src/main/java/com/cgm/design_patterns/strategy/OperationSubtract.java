package com.cgm.design_patterns.strategy;

public class OperationSubtract implements Operation {

    @Override
    public Long doOperation(Long numOne, Long numTwo) {
        return numOne - numTwo;
    }

}

