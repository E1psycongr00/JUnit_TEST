# JUnit_TEST


## JUnit
- java 진영의 대표적인 TestFramework이다. 대부분의 java 개발자는 단위 테스트 도구로 JUnit을 쓴다.
- 단위 테스트를 위한 도구를 제공한다.
    * 코드의 특정 모듈이  의도한 대로 동작하는 절차를 의미
    * 모든 함수오 메소드에 대해서 각각의 단위 테스트가 가능함.
- Assert문을 이용해 수행 결과를 확인 가능하다.
- Spring boot 2.2 버전 부터는 junit5 버전을 사용한다.
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