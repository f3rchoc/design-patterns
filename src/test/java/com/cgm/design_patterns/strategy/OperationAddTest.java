package com.cgm.design_patterns.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationAddTest {

    private Operation operation;

    @BeforeEach
    void setUp() {
        this.operation = new OperationAdd();
    }

    @Test
    void should_return_0_when_all_parameters_all_0 () {
        assertEquals(0L, this.operation.doOperation(0L, 0L));
    }

}