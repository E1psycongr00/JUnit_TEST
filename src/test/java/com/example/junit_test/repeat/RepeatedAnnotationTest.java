package com.example.junit_test.repeat;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;


public class RepeatedAnnotationTest {

    // 5번 반복
    @RepeatedTest(5)
    void repeated1(RepetitionInfo repetitionInfo) {
        Assertions.assertEquals(5, repetitionInfo.getTotalRepetitions());
    }

    /*
        1. displayName => @DisplayName
        2. currentRepetition => 현재 반복수
        3. totalRepetitions => total 반복수
     */
    @RepeatedTest(value=5, name="{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("Repeat!..")
    void customDisplayName(TestInfo testInfo) {
        Assertions.assertEquals("Repeat!.. 1/5", testInfo.getDisplayName());
    }


}
