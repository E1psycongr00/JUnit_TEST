package com.example.junit_test.extendwith;

import com.example.junit_test.extendwith.extension.LoggingPostProcessExtension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;



public class ArithmeticTest {
    private int result = 5;

    @ExtendWith(LoggingPostProcessExtension.class)
    @Test
    void testDrive() {
        result = result / 5;
        Assertions.assertEquals(1, result);
    }
}
