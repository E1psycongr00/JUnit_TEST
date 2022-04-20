package com.example.junit_test.extendwith;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS) // 생명주기는 클래스
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // 순서에 의해 테스트 실행
public class JunitLifeCycleTest {
    private int count = 0;

    @BeforeEach
    private void setUp() {
        count += 1;
    }

    @Test
    @Order(1) // 처음 실행되는 메서드
    @DisplayName("자원공유테스트")
    public void share1() {
        assertEquals(1, count);
    }

    @Test
    @Order(2) // 처음 실행되는 메서드
    public void 자원공유테스트2() {
        // org.assertj.core.api.Assertions의 장점은 비교를 메서드 체이닝 형태로 사용 할 수 있음.
        assertThat(count)
                .isGreaterThan(1)
                .isLessThan(10);
        System.out.println(count);
    }
}
