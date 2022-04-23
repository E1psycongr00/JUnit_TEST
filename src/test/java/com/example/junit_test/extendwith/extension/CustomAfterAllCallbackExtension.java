package com.example.junit_test.extendwith.extension;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.*;

public class CustomAfterAllCallbackExtension implements BeforeAllCallback, BeforeEachCallback, BeforeTestExecutionCallback,
AfterTestExecutionCallback, AfterEachCallback, AfterAllCallback{

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("BeforeAll");
    }
    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("beforeEach");
    }
    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("beforeTestExecution");
    }
    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("afterTestExecution");
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("afterEach");
    }
    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("afterAll");
    }

}
