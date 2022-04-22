package com.example.junit_test.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParameterizedTestCsvSource {

    @ParameterizedTest
    @CsvSource(value= {
            "apple, 1",
            "banana, 2",
            "'lemon, lime', 0xF1",
            "'', 10"
    }, delimiter = ',', emptyValue = "1") // emptyValue= 빈값을 지정 값으로 바꿈
    void testWithCsvSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    @ParameterizedTest
    @CsvSource(value= {
            "apple, NL",
    }, nullValues = {"NL", "apple"}) // NL apple 을 null값으로 바꿈
    void testWithCsvSource2(String fruit, Integer rank) {
        assertNull(fruit);
        assertNull(rank);
    }
}
