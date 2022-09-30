package com.cgm.design_patterns.strategy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {

    private Context context;
    private static final Long NUM_ONE = 1L;
    private static final Long NUM_TWO = 2L;

    @BeforeEach
    void setUp() {
        this.context = null;
    }

    @Test
    void should_execute_addOperation() {
        this.context = new Context(new OperationAdd());
        assertEquals(this.context.executeOperation(NUM_ONE, NUM_TWO), 3L);
    }

    @Test
    void should_execute_subtractOperation() {
        this.context = new Context(new OperationSubtract());
        assertEquals(this.context.executeOperation(NUM_ONE, NUM_TWO), -1L);
    }

    @Test
    void should_execute_multiplyOperation() {
        this.context = new Context(new OperationMultiply());
        assertEquals(this.context.executeOperation(NUM_ONE, NUM_TWO), 2L);
    }

}