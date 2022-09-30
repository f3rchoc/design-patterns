package com.cgm.design_patterns.strategy;

public class OperationAdd implements Operation {

    @Override
    public Long doOperation(Long numOne, Long numTwo) {
        return numOne + numTwo;
    }

}
