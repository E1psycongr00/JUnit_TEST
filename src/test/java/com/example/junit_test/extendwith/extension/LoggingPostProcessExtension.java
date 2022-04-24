package com.example.junit_test.extendwith.extension;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingPostProcessExtension implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        Logger logger = LogManager.getLogManager().getLogger(testInstance.getClass().getName());

        System.out.println("Test instance Post-          Process Extension called on :"+ testInstance.getClass().getName());
    }
}
