package com.example.junit_test.extendwith.extension;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.InvocationInterceptor;
import org.junit.jupiter.api.extension.ReflectiveInvocationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;



public class TimingInterceptorExtension implements InvocationInterceptor {
    private static Logger logger = LoggerFactory.getLogger(TimingInterceptorExtension.class);

    @Override
    public void interceptTestMethod(Invocation<Void> invocation,
                    ReflectiveInvocationContext<Method> invocationContext,
                    ExtensionContext extensionContext) throws Throwable {

        String methodName = invocationContext.getExecutable().getName();
        long startTime = System.currentTimeMillis();
        invocation.proceed();
        long spendTime = System.currentTimeMillis() - startTime;
        logger.info(String.format("test 메서드 : [%s], 수행시간 %s", methodName,spendTime));

        // InvocationInterceptor.super.interceptTestMethod(invocation, invocationContext, extensionContext);
    }
}
