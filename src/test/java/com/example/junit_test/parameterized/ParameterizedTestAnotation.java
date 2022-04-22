package com.example.junit_test.parameterized;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.lang.Nullable;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTestAnotation {

    // 지원 타입 : short[], byte[], int[], long[], float[], double[], char[], boolean[], String[], Class<?>[]
    @ParameterizedTest
    @ValueSource(ints={1,2,3})
    void testWithValueSource(int intArg) {
        assertTrue(intArg > 0 && intArg < 4);
    }

    // test 메서드 매개변수가 1개 일 때 사용 가능
    // primitive 타입은 null을 가질 수 없으므로 box형태나 클래스만 가능
    @ParameterizedTest
    @NullSource
    void testWithNullSource(Integer intArg) {
        assertTrue(intArg == null);
    }

    // 해당하는 enum의 모든 값을 검사함
    @ParameterizedTest
    @EnumSource(value= Month.class)
    void testWithEnumSource(Month month) {

    }

    // value 생략시 매개변수보고 인식해서 넣어줌
    @ParameterizedTest
    @EnumSource
    void testWithEnumSource2(Month month) {

    }

    // enum name이 "May" 인 것만 검사
    @ParameterizedTest
    @EnumSource(mode= EnumSource.Mode.INCLUDE, names={"MAY"})
    void testWithEnumSourceInclude(Month month) {

    }

    // enum name이 "May"가 아닌 것만 검사
    @ParameterizedTest
    @EnumSource(mode= EnumSource.Mode.EXCLUDE, names={"MAY", "MARCH"})
    void testWithEnumSourceExclude(Month month) {

    }


}
