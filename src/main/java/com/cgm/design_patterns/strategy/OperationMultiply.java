package com.cgm.design_patterns.strategy;

public class OperationMultiply implements Operation {

    @Override
    public Long doOperation(Long numOne, Long numTwo) {
        return numOne * numTwo;
    }

}
