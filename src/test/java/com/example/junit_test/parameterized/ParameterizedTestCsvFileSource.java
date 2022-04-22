package com.example.junit_test.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

// 외부 csv 파일을 resources에 넣어주면 csv를 인식하고 읽어 올 수 있다.
public class ParameterizedTestCsvFileSource {

    // numLinesToSkip은 보통 csv 첫번째는 column 정보가 헤더로 들어가기 때문에 첫번째를 스킵한다.
    @ParameterizedTest
    @CsvFileSource(resources = "/two-column.csv", numLinesToSkip = 1)
    void testCsvFileSourceResource(String country, int reference) {

    }

}
