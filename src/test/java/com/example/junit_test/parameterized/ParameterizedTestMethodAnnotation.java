package com.example.junit_test.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParameterizedTestMethodAnnotation {
    static Stream<String> testWithDefaultLocalMethodSource() {
        return Stream.of("apple", "pen");
    }

    // 메소드가 같으면 명시된 static 메소드를 자동으로 가져 올 수 있다.
    @ParameterizedTest
    @MethodSource
    void testWithDefaultLocalMethodSource(String argument) {
        assertNotNull(argument);
    }

    // 메소드를 가져오려면 @MethodSource에 static 메소드명을 직접 기입해준다.
    @ParameterizedTest
    @MethodSource("testWithDefaultLocalMethodSource")
    void testWithDefaultLocalMethodSource2(String argument) {
        assertNotNull(argument);
    }
}
