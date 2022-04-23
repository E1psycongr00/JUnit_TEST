package com.example.junit_test.extendwith;

import com.example.junit_test.extendwith.extension.CustomAfterAllCallbackExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CustomAfterAllCallbackExtension.class)
public class CustomCallbackTest {

    @Test
    void Test() {
        System.out.println("ths is test method");
    }
}
