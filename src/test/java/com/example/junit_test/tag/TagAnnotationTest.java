package com.example.junit_test.tag;


import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/*
    테스트 클래스, 메소드에 테스트 구분을 태깅하기 위해 사용
 */

public class TagAnnotationTest {

    @Test
    @Tag("fast")
    void fast_1() {

    }
    @Test
    @Tag("fast")
    void fast_2() {

    }

    @Test
    @Tag("slow")
    void slow_1() {

    }

    @Test
    @Tag("slow")
    void slow_2() {

    }
}
