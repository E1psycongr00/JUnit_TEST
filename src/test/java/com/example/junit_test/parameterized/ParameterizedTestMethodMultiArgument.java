package com.example.junit_test.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestMethodMultiArgument {
    @ParameterizedTest
    @MethodSource("stringIntAndListProvider")
    void testWithMultiArgMethodSource(String str, int num, List<String> list) {
        assertEquals(5, str.length());
        assertTrue(num >=1 && num <=2);
        assertEquals(2, list.size());
    }

    // MethodSource를 이용해서 멀티 파라미터를 사용하려면 Arguments를 활용한다.
    // org.junit.jupiter.params.provider.Arguments;
    static Stream<Arguments> stringIntAndListProvider() {
        return Stream.of(
                Arguments.arguments("apple",1, Arrays.asList("a", "b")),
                Arguments.arguments("lemon",2, Arrays.asList("x", "y"))
        );
    }
}
