# JUnit_TEST


## JUnit
- java 진영의 대표적인 TestFramework이다. 대부분의 java 개발자는 단위 테스트 도구로 JUnit을 쓴다.
- 단위 테스트를 위한 도구를 제공한다.
    * 코드의 특정 모듈이  의도한 대로 동작하는 절차를 의미
    * 모든 함수오 메소드에 대해서 각각의 단위 테스트가 가능함.
- Assert문을 이용해 수행 결과를 확인 가능하다.
- Spring boot 2.2 버전 부터는 junit5 버전을 사용한다.
- 
<details>
<summary>JUnit 모듈 설명</summary>
<div markdown="1">

### Jupiter
- `TestEngine API` 구현체로 `JUnit5`를 구현하고 있다.
- 테스트의 실제 구현체는 별도 모듈 역할을 수행하는데 , 그 모듈 중 하나로 Jupiter
모듈은 개발자가 테스트 코드를 작성할 때 사용됨.

### JUnit Platform
- test를 실행하기 위한 뼈대
- test를 발견하고 테스트 계획을 생성하는 testEngine 인터페이스를 가지고 있음
- TestEngine을 통해 Test를 발견하고 수행 및 결과를 보고함.
- 각종 IDE 연동을 보조하는 역할 수행(콘솔 출력 .... etc...)
- (Platform = TestEngine API + Console Launcher + JUnit 4 Based Runner 등)

### Vintage
- Junit4, Junit3 같은 레거시 라이브러리를 쓸 수 있게 해준다.

![JUnit](JUnit.jpg)

</div>
</details>


<details>
<summary>JUnit 어노테이션 설명</summary>
<div markdown="1">

## @SpringBootTest

- 통합 테스트 용도
- @SpringBootApplicationㅇ르 찾아가 하위의 모든 Bean을 스캔하여 로드
- 그 후 Test용 Application Context를 만들어 Bean을 추가하고, MockBean을 찾아가  교체

## @ExtendWith

- junit4에서 @RunWith로 사용되던 어노테이션
- 테스트에 AOP개념을 활용 할 수 있음
- 오류 핸들러, 인터셉트 가능
- @SpringBootTest에는 기본적으로 @ExtendWith가 추가되어 있음

[JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/#extensions-registration-declarative)

[Junit 5 with Spring Boot: When to use @ExtendWith Spring or Mockito?](https://stackoverflow.com/questions/61433806/junit-5-with-spring-boot-when-to-use-extendwith-spring-or-mockito)

[번외편 - Junit LifeCycle과 @ExtendWith 에 대해 알아보자](https://huisam.tistory.com/entry/junit)

[Spring Boot Context Test - 스프링 컨텍스트 테스트 (aka. IntegrationTest)](https://huisam.tistory.com/entry/springBootTest)

[JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions)

[JUnit 5.8.2 API](https://junit.org/junit5/docs/current/api/)

## @WebMvcTest(Class명.class)

- ()에 작성된 클래스만 실제로 로드하여 테스트를 진행
- 매개변수를 지정해주지 않으면 @Controller, @RestController, @RestControllerAdvice 등 컨트롤러와 연관된 bean을 로드함
- 스프링의 모든 Bean을 로드하는 @SpringBootTest대신 컨트롤러 관련 코드만 테스트 할 경우 사용됨(SpringBootTest보다 상대적으로 가볍다.)
</div>
</details>