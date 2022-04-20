package extendwith;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;


/*
    1. lifeCycle 콜백 함수를 이용한 구현체를 Extendwith에 넣어주면 test에 AOP처럼 사용 할 수 있음.
    2. SpringExtension.class를 넣어주는 경우 SpringContext환경을 제공해준다.
        - bean을 활용하기 가능(bean은 따로 주입해줘야 한다.)
        - ApplicationContext 가 하나 만들어진다고 보면 된다.
 */
@ExtendWith(TimingExtension.class)
public class TimingExtensionTest {

    @Test
    void sleep20ms() throws Exception {
        Thread.sleep(20);
    }

    @Test
    void sleep50ms() throws Exception {
        Thread.sleep(50);
    }
}
