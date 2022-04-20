package extendwith;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/*
    1. InvocationInterceptor는 Spring AOP의 Around advice와 상당히 유사하다.
        - invocation.proceed() == ProceedingJoinPoint point.proceed()
    2. @ExtensionWith는 클래스가 아닌 Test 메서드 위에 사용하면 특정 메서드에서만 작동한다.
 */

//@ExtendWith(TimingInterceptorExtension.class)
public class TimingExtensionTest2 {

    @ExtendWith(TimingInterceptorExtension.class)
    @Test
    void sleep20ms() throws Exception {
        Thread.sleep(20);
    }

    @Test
    void sleep50ms() throws Exception {
        Thread.sleep(50);
    }
}
